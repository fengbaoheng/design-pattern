package accounts;

import java.util.Set;

/**
 * 抽象主题
 */
public interface Subject {
    /**
     * @return 当前订阅号的所有读者
     */
    Set<Observer> getObservers();

    /**
     * 订阅
     *
     * @param observer 读者
     */
    default void attach(Observer observer) {
        getObservers().add(observer);
    }

    /**
     * 取消订阅
     *
     * @param observer 读者
     */
    default void detach(Observer observer) {
        getObservers().remove(observer);
    }

    /**
     * 发布文章
     *
     * @param article 文章
     */
    void sendArticle(String article);
}
