package EX_OOP.ex_6_bankingapp;

public class SpendingAccount extends BankAccount {
    int maxwithdrawlAmount;

    public SpendingAccount(int balance, String accountNumber, int maxwithdrawlAmount) {
        super(balance, accountNumber);
        this.maxwithdrawlAmount = maxwithdrawlAmount;
    }

    @Override
    public int withdraw(int amount) throws OperationNotSupportedException {
        if (amount > maxwithdrawlAmount + getBalance()) {
            throw new OperationNotSupportedException("nu poti retrage mai mult decat " + maxwithdrawlAmount + " plus " + getBalance());
        }
        setBalance(getBalance() - amount);
        return getBalance();
    }

    @Override
    public int deposit(int amount) {
        setBalance(getBalance() + amount);
        return getBalance();
    }

    @Override
    public String toString() {
        return "SpendingAccount{" +
                "maxwithdrawlAmount=" + maxwithdrawlAmount +
                "balance=" + getBalance() +
                "accountNumber=" + getAccountNumber() +
                '}';
    }
}
