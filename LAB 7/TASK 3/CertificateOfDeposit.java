public class CertificateOfDeposit extends BankAccount {
    private int termMonths;

    public CertificateOfDeposit(String accountNumber, double initialBalance, int termMonths) {
        super(accountNumber, initialBalance);
        this.termMonths = termMonths;
    }

    // Override the withdraw method to prevent withdrawals during the term
    @Override
    public boolean withdraw(double amount) {
        if (termMonths > 0) {
            return false;
        }
        return super.withdraw(amount);
    }
}
