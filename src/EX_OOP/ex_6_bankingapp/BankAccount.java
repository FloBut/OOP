package EX_OOP.ex_6_bankingapp;
//6. Creează o aplicație de gestionare a conturilor deschise la o bancă pentru un client.
//Clasa abstractă BankAccount
//Atribute:
//
//balance (câți bani se află în cont, o valoare de tip double care semnifică suma în lei)
//accountNumber
//Metode:
//
//Metoda abstractă withdraw()
//Metoda abstractă deposit()
public abstract class BankAccount {
   private int balance;
    private String accountNumber;

    public BankAccount(int balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }
    public abstract int withdraw(int amount) throws OperationNotSupportedException;
    public abstract int deposit(int amount) throws OperationNotSupportedException;
}
