package eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * 记录观察者中需要执行的方法
 */
public class ObserverAction {
    /**
     * 观察者对象 调用反射时使用
     */
    public final Object target;

    /**
     * 事件执行方法 发布事件时调用反射执行
     * 即观察者中被@Subscribe标注的方法
     */
    public final Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    /**
     * 将事件作为方法参数传入@Subscribe方法并调用
     *
     * @param event 事件
     */
    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            System.out.println("无法执行方法: " + method.getName());
            e.printStackTrace();
        }
    }


}

