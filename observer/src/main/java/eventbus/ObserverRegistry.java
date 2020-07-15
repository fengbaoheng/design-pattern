package eventbus;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Stream;

/**
 * 负责维护观察者注册信息
 */
public class ObserverRegistry {
    private final Map<Class<?>, Set<ObserverAction>> registry = new ConcurrentHashMap<>();

    public void register(Object observer) {
        Objects.requireNonNull(observer, "观察者为null");

        findAllObserverActions(observer).forEach((eventType, eventActions) -> {
            if (!registry.containsKey(eventType)) {
                registry.put(eventType, new CopyOnWriteArraySet<>());
            }
            registry.get(eventType).addAll(eventActions);
        });
    }


    /**
     * 获取事件对应的所有匹配的方法
     *
     * @param event 事件
     * @return 匹配的方法
     */
    public Stream<ObserverAction> getMatchedObserverAction(Object event) {
        Objects.requireNonNull(event, "事件为null");

        Class<?> paramType = event.getClass();
        return registry.keySet()
                .stream()
                .filter(eventType -> eventType.isAssignableFrom(paramType))
                .flatMap(k -> registry.get(k).stream());
    }


    /**
     * 获取一个类中的所有标注方法
     *
     * @param clazz 类信息
     * @return 标注的方法
     */
    private Stream<Method> getSubscribeMethods(Class<?> clazz) {
        return Arrays.stream(clazz.getDeclaredMethods())
                .filter(this::isValidMethod);
    }

    /**
     * 验证类的方法是否为有效的通知方法
     * 1. @Subscribe注解标注
     * 2. 函数参数只能有1个
     *
     * @param method 方法对象
     * @return 方法是否有效
     */
    private boolean isValidMethod(Method method) {
        if (method.isAnnotationPresent(Subscribe.class)) {
            if (method.getParameterCount() != 1) {
                throw new RuntimeException(method.getName() + "只能有1个参数!(@Subscribe)");
            }
            return true;
        }
        return false;
    }


    /**
     * 获取观察者类中标注的所有方法
     * 生成ObserverAction,并按参数类型分组
     *
     * @param observer 观察者
     * @return ObserverAction
     */
    private Map<Class<?>, List<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, List<ObserverAction>> observerActions = new HashMap<>();
        getSubscribeMethods(observer.getClass()).forEach(method -> {
            Class<?> eventType = method.getParameterTypes()[0];
            if (!observerActions.containsKey(eventType)) {
                observerActions.put(eventType, new ArrayList<>());
            }
            observerActions.get(eventType).add(new ObserverAction(observer, method));
        });

        return observerActions;
    }
}
