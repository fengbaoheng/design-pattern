package accounts;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 订阅号
 */
public class OfficialAccount implements Subject {
    /**
     * 所有粉丝
     */
    private final Set<Observer> followers = new HashSet<>();

    /**
     * 推送的所有文章
     */
    private final List<String> totalArticles = new LinkedList<>();


    @Override
    public Set<Observer> getObservers() {
        return this.followers;
    }

    /**
     * 向所有粉丝推送文章
     *
     * @param article 文章
     */
    @Override
    public void sendArticle(String article) {
        this.totalArticles.add(article);

        for (Observer observer : getObservers()) {
            observer.receiveArticle(article);
        }
    }

    @Override
    public String toString() {
        return totalArticles.toString();
    }
}
