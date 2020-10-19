package creditcard;

/**
 * 欠费状态
 */
public class ArrearsState extends AccountState {
    @Override
    public String getName() {
        return "欠费状态";
    }

    @Override
    public boolean deposit(Account account, double money) {
        account.setBalance(account.getBalance() + money);

        // 判断是否从欠费状态变为了正常状态
        if (account.getBalance() >= NORMAL_BALANCE) {
            account.setState(new NormalState());
        }

        return true;
    }

    @Override
    public boolean withdraw(Account account, double money) {
        account.setBalance(account.getBalance() - money);

        // 判断是否会转换为欠费状态
        if (account.getBalance() < ARREARS_BALANCE) {
            account.setState(new RiskState());
        }

        return true;
    }
}
