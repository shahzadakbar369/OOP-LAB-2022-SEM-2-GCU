public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String accountNumber, double initialBalance, double limit) {
        super(accountNumber, initialBalance);
        this.limit = limit;
    }

    // Override the withdraw method to account for the overdraft limit
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance + limit >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
