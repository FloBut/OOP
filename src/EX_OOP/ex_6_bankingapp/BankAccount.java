package EX_OOP.ex_6_bankingapp;

public abstract class BankAccount {
    private int balance;
    private String accountNumber;

    public BankAccount(int balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public static void addAcount(Client client) {

    }


    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }


   /* public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    public String getAccountNumber() {

        return accountNumber;
    }

    public abstract int withdraw(int amount);

    public abstract int deposit(int amount);


}
