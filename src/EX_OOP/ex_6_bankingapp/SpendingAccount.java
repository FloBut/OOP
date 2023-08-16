package EX_OOP.ex_6_bankingapp;

public class SpendingAccount extends BankAccount {
    int maxwithdrawlAmount;

    public SpendingAccount(int balance, String accountNumber, int maxwithdrawlAmount) {
        super(balance, accountNumber);
        this.maxwithdrawlAmount = maxwithdrawlAmount;
    }

    @Override
    public int withdraw(int amount) {
        if (amount <= maxwithdrawlAmount + getBalance()) {
            setBalance(getBalance() - amount);
        }
        return getBalance();
    }

    @Override
    public int deposit(int amount) {
        //la balanta spending account-ului curent adaugam amount-ul primit ca parametru
        setBalance(getBalance() + amount);
        return getBalance();
    }

    @Override
    public String toString() {
        return "SpendingAccount{" +
                "maxwithdrawlAmount=" + maxwithdrawlAmount +
                "balance="+ getBalance() +
                "äccountnumber=" + getAccountNumber() +
                '}';
    }
}
