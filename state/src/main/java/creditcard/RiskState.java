package creditcard;

/**
 * 风险状态
 */
public class RiskState extends AccountState {
    @Override
    public String getName() {
        return "风险状态";
    }

    @Override
    public boolean deposit(Account account, double money) {
        account.setBalance(account.getBalance() + money);

        // 判断是否从欠费状态变为了正常状态
        if (account.getBalance() >= NORMAL_BALANCE) {
            account.setState(new NormalState());
        } else if (account.getBalance() >= ARREARS_BALANCE) {
            account.setState(new ArrearsState());
        }

        return true;
    }

    /**
     * 风险状态不允许取钱操作
     *
     * @param account 账户对象
     * @param money   取款金额
     * @return 取钱一定失败
     */
    @Override
    public boolean withdraw(Account account, double money) {
        return false;
    }
}
