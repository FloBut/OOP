package EX_OOP.ex_6_bankingapp;
//Clasa StudentAccount (extinde BankAccount)
//Atribute:
//
//maxDepositAmount - va trebui să nu își schimbe valoarea o dată ce a fost inițializată
//Metode:
//
//Metoda withdraw() - se pot retrage maxim câți bani sunt în cont în momentul retragerii
//Metoda deposit() - se pot depune maxim “maxDepositAmount” bani o dată
import com.sun.tools.attach.AgentInitializationException;

public class StudentAccount extends BankAccount {
    private final int maxDepositAmount;

    public StudentAccount(int balance, String accountNumber, int maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    @Override
    public int withdraw(int amount) throws OperationNotSupportedException {
        //daca balanta contului e mai mare decat suma mea, retrag banii
        if (getBalance() < amount){
            throw new OperationNotSupportedException("ÿou cannot withdraw more than you have form a student account");
        }
        setBalance(getBalance() - amount);
        return getBalance();
    }

    @Override
    public int deposit(int amount) throws OperationNotSupportedException {
        //daca amount-ul este mai mic decat maxDeposit
        //atunci depun suma
        //returnez balanta curenta
       if (amount > maxDepositAmount){
           throw new OperationNotSupportedException("ÿou cannot deposit more than "+ maxDepositAmount);
       }
        setBalance(getBalance() + amount);
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
