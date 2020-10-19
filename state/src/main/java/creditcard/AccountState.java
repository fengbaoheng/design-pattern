package creditcard;

/**
 * 抽象账户状态
 */
public abstract class AccountState {

    protected static final int NORMAL_BALANCE = 0;

    protected static final int ARREARS_BALANCE = -2000;

    public abstract String getName();

    /**
     * 存款操作
     *
     * @param account 账户对象
     * @param money   存款金额
     * @return 存款是否成功
     */
    public abstract boolean deposit(Account account, double money);

    /**
     * 取款操作
     *
     * @param account 账户对象
     * @param money   取款金额
     * @return 取款是否成功
     */
    public abstract boolean withdraw(Account account, double money);
}
