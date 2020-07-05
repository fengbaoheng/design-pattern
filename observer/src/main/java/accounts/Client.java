package accounts;

public class Client {
    public static void main(String[] args) {
        // 新闻和游戏订阅号
        OfficialAccount newsAccount = new OfficialAccount();
        OfficialAccount gameAccount = new OfficialAccount();

        // 三位用户
        User A = new User();
        User B = new User();
        User C = new User();

        // 设置用户订阅
        newsAccount.attach(A);
        newsAccount.attach(C);
        gameAccount.attach(B);
        gameAccount.attach(C);

        // 推送
        newsAccount.sendArticle("news1");
        gameAccount.sendArticle("game1");

        // 修改订阅
        newsAccount.detach(A);
        gameAccount.attach(A);

        // 再次推送
        newsAccount.sendArticle("news2");
        gameAccount.sendArticle("game2");
    }
}
