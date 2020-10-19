package creditcard;

/**
 * 正常状态
 */
public class NormalState extends AccountState {
    @Override
    public String getName() {
        return "正常状态";
    }

    @Override
    public boolean deposit(Account account, double money) {
        // 正常状态存款任意数字均为正常状态
        account.setBalance(account.getBalance() + money);
        return true;
    }

    @Override
    public boolean withdraw(Account account, double money) {
        account.setBalance(account.getBalance() - money);

        // 判断是否需要转换账户状态
        double currentBalance = account.getBalance();
        if (currentBalance < NORMAL_BALANCE) {
            if (currentBalance >= ARREARS_BALANCE) {
                // 欠费状态
                account.setState(new ArrearsState());
            } else {
                // 风险状态
                account.setState(new RiskState());
            }
        }

        return true;
    }
}
