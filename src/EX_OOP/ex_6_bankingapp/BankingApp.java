package EX_OOP.ex_6_bankingapp;

import fitnessApp.Product;

public class BankingApp {
    public static void main(String[] args) {
        Client client = new Client("Ïonica", "Georgel");
        BankAccount account1 = new SpendingAccount(500, "nr1", 200);
        BankAccount account2 = new StudentAccount(500, "nr2", 200);
        BankAccount account3 = new StudentAccount(500, "nr3", 200);
        BankAccount account4 = new SpendingAccount(500, "nr4", 200);

        client.addAccount(account1);
        client.addAccount(account2);
        client.addAccount(account3);
        client.addAccount(account4);

        //client.listAccounts();


        client.deposit(500, "nr1");

        System.out.println(client.checkAccountDetails("nr1"));

        client.withdraw(600, "nr4");
        System.out.println(client.checkAccountDetails("nr4"));


        // de apelat constructorul cu parametri dupa ce va fi creat



    }
}
