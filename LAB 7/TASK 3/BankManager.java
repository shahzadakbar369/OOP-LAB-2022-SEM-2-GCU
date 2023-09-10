public class BankManager {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("CA123", 1000.0, 200.0);
        SavingsAccount savingsAccount = new SavingsAccount("SA456", 1500.0, 0.03);
        CertificateOfDeposit certificateOfDeposit = new CertificateOfDeposit("CD789", 2000.0, 12);

        checkingAccount.deposit(200);
        savingsAccount.withdraw(100);
        certificateOfDeposit.withdraw(300);

        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
        System.out.println(certificateOfDeposit);
    }
}
