package EX_OOP.ex_6_bankingapp;
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
public class Client {
        private String firstName;
        private String lastName;
        private BankAccount[] accounts;
        private int numberOfAccountsAdded;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new BankAccount[20];
        numberOfAccountsAdded = 0;
    }
    public Client(){}



    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public BankAccount[] getAccounts() {

        return accounts;
    }

    public void setAccounts(BankAccount[] accounts) {

        this.accounts = accounts;
    }

    public int getNumberOfAccountsAdded() {

        return numberOfAccountsAdded;
    }

    public void setNumberOfAccountsAdded(int numberOfAccountsAdded) {
        this.numberOfAccountsAdded = numberOfAccountsAdded;
    }

    public boolean addAccount(BankAccount account) {
        accounts[numberOfAccountsAdded++] = account;
        return true;
    }
    public void listAccounts() {
        for (int i = 0; i < numberOfAccountsAdded; i++){
            System.out.println(accounts[i]);
        }
    }
    public int deposit(int amount, String accountNumber) throws OperationNotSupportedException {
        //gasesc contul cu numarul accountNumber
        // in acel cont depozitez
        BankAccount account = findAccount(accountNumber);
        if (account == null){
            return Integer.MIN_VALUE;
        }
        return account.deposit(amount);
    }
    public int withdraw(int amount, String accountNumber) throws OperationNotSupportedException {
        // caut in lista de conturi numarul contului din care vreau sa scot bani
        //gasesc contul si scot banii
        BankAccount account = findAccount(accountNumber);
        if (account == null){
            return Integer.MIN_VALUE;
        }
        account.withdraw(amount);
        return account.getBalance();
    }
    public String checkAccountDetails(String accountNumber) {
        //caut in lista contul cu numarul respectiv si afisez detaliile contului:
        // balanta, fist name, last name,
        BankAccount account = findAccount(accountNumber);
        if (account == null){
            return "";
        }
        return account.toString() + this.firstName + this.lastName;
    }

    private BankAccount findAccount (String accountNumber){
        //parcrugem lista de conturi a clientului curent
            //verificam daca numarul primit ca parametru este egal cu numele contului curent din parcurgere
            //daca da, returnam contul curent din parcurgere
        //returnam null
        for (int i = 0; i < numberOfAccountsAdded; i++){
            if (accountNumber.equals(accounts[i].getAccountNumber())){
                return accounts[i];
            }
        }
        return null;
    }

}
