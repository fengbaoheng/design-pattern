package eventbus;

import java.util.concurrent.Executor;

/**
 * 事件总线
 * 是观察者模式中的被观察者角色
 * 通用框架，参数都为Object类型
 */
public class EventBus {

    /**
     * 执行线程池
     * 可以在发布事件时异步通知所有观察者
     */
    private final Executor executor;
    private final ObserverRegistry registry = new ObserverRegistry();

    public EventBus(Executor executor) {
        this.executor = executor;
    }

    /**
     * 注册观察者
     *
     * @param object 观察者
     */
    public void register(Object object) {
        registry.register(object);
    }

    /**
     * 发布事件
     * 将该事件发送给匹配的观察者, 即能够接收event实际类型的观察者
     *
     * @param event 事件
     */
    public void post(Object event) {
        registry.getMatchedObserverAction(event)
                .forEach(observerAction -> {
                    // 创建任务并提交线程池执行
                    Runnable runnable = () -> observerAction.execute(event);
                    executor.execute(runnable);
                });
    }

}
