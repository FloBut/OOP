package EX_OOP.ex_6_bankingapp;

import fitnessApp.Product;

public class BankingApp {
    public static void main(String[] args)  {
        Client client = new Client("Ionica", "Gergel");
        //creez un obiect in clasa spacc pentr a putea apela metoda witdraw din clasa spendingAccount
        BankAccount account1 = new SpendingAccount(5000,"nr1", 2000);
        BankAccount account2 = new StudentAccount(5000,"nr2", 2000);
        BankAccount account3 = new SpendingAccount(5000,"nr3", 2000);
        BankAccount account4 = new StudentAccount(5000,"nr4", 2000);

        client.addAccount(account1);
        client.addAccount(account2);
        client.addAccount(account3);
        client.addAccount(account4);
        client.listAccounts();

        try {
            client.deposit(2001, "nr4");
        }catch (OperationNotSupportedException e){
            System.out.println(e.getMessage());
        }



        // de apelat constructorul cu parametri dupa ce va fi creat



    }
}
