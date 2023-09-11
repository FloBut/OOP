package EX_OOP.ex_6_bankingapp;
//Clasa SpendingAccount (extinde BankAccount)
//Atribute:
//
//maxWithdrawalAmount - poate să își schimbe valoarea o dată ce a fost inițializată
//Metode:
//
//Metoda withdraw() - se pot retrage cu maxim “maxWithdrawalAmount” RON mai mult decât există în cont în momentul retragerii (exemplu: dacă în cont sunt 5000 de RON, iar maxWithdrawalAmount este 2000 RON, se pot retrage maxim 7000 RON)
//Metoda deposit() - oricâți bani se pot depune în cont
//Clasa Person
//Atribute:
//
//firstName
//lastName
//accountList - adică un array care ține lista de conturi ale unei persoane
//Metode:
//
//Metoda addAccount() - va da posibilitatea persoanei să adauge un cont în lista de conturi
//Metoda listAccounts() - va printa accountNumber împreună cu balance pentru fiecare cont din listă
//Metoda deposit() - va adăuga o anumită sumă de bani într-un cont
//Metoda withdraw() - va retrage o anumită sumă de bani dintr-un cont
//Metoda checkAccountDetails() - va printa toate detaliile unui anumit cont
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
