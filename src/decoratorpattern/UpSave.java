package decoratorpattern;

public class UpSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", with Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return (bankAccount.getBalance() * getInterestRate()) + bankAccount.getBalance();
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
