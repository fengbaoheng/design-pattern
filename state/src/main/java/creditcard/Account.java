package creditcard;

/**
 * 账户
 */
public abstract class Account {
    /**
     * 余额
     */
    private double balance;

    /**
     * 当前账户状态
     */
    private AccountState state;

    public Account() {
        this.balance = 0.0;
        this.state = new NormalState();
    }

    public boolean deposit(double money) {
        return state.deposit(this, money);
    }

    public boolean withdraw(double money) {
        return state.withdraw(this, money);
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
