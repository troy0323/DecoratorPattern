package decoratorpattern;

public class SavingsAccount implements BankAccount {

    private int accountNumber;
    private String accountName;
    private double balance;

    public SavingsAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public SavingsAccount() {

    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance + balance * getInterestRate();
    }

    @Override
    public String showInfo() {
        return String.format(
                "Account Number: %s%nAccount Name: %s%nBalance: %.2f", accountNumber, accountName, balance);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
