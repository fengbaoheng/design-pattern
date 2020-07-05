package accounts;

import java.util.LinkedList;
import java.util.List;

/**
 * 用户类
 */
public class User implements Observer {
    /**
     * 接收的所有文章
     */
    private List<String> totalArticles = new LinkedList<>();


    @Override
    public void receiveArticle(String article) {
        this.totalArticles.add(article);
    }

    @Override
    public String toString() {
        return totalArticles.toString();
    }
}
