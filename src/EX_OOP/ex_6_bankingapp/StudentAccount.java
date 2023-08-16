package EX_OOP.ex_6_bankingapp;

import com.sun.tools.attach.AgentInitializationException;

public class StudentAccount extends BankAccount {
    private final int maxDepositAmount;

    public StudentAccount(int balance, String accountNumber, int maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    @Override
    public int withdraw(int amount) {
        //daca balanta contului e mai mare decat suma mea, retrag banii
        if (getBalance() >= amount){
            setBalance(getBalance() - amount);
        }
        return getBalance();
    }

    @Override
    public int deposit(int amount) {
        //daca amount-ul este mai mic decat maxDeposit
        //atunci depun suma
        //returnez balanta curenta
       if (amount <= maxDepositAmount){
           setBalance(getBalance() + amount);
       }
       return getBalance();
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "maxDepositAmount=" + maxDepositAmount +
                "balance="+ getBalance() +
                "äccountnumber=" + getAccountNumber() +
                '}';
    }
}
