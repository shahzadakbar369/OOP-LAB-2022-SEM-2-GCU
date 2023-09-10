class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                throw new InsufficientFundsException("Insufficient funds to withdraw $" + amount);
            }
        }
    }



    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(500.0);
        System.out.println("New Balance after deposit: $" + account.getBalance());

        try {
            account.withdraw(200.0);
            System.out.println("New Balance after withdrawal: $" + account.getBalance());
            account.withdraw(1500.0); // This will throw an InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}