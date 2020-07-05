package accounts;

/**
 * 抽象观察者
 */
public interface Observer {
    /**
     * 接收公帐号文章
     *
     * @param article 文章
     */
    void receiveArticle(String article);
}
