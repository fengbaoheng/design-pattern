package uml;

import java.util.HashSet;
import java.util.Set;

/**
 * 主题、发布者
 */
public interface Subject {
    /**
     * @return 所有订阅当前主题的观察者
     */
    Set<Observer> getObservers();

    /**
     * 观察者订阅本主题
     *
     * @param observer 观察者
     */
    default void attach(Observer observer) {
        getObservers().add(observer);
    }

    /**
     * 观察者取消订阅本主题
     *
     * @param observer 观察者
     */
    default void detach(Observer observer) {
        getObservers().remove(observer);
    }

    /**
     * 通知所有观察者
     */
    default void notifyObservers() {
        getObservers().forEach(Observer::update);
    }
}
