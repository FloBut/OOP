package EX_OOP.ex_7.ghiozdan;

public class Main {
    public static void main(String[] args) {
        Backpack backpack = new Backpack(100);
        Book book1 = new Book("carte1", 100, 10);
        Book book2 = new Book("carte1", 200, 50);
        Book book3 = new Book("carte1", 300, 20);
        backpack.addBook(book1);
        backpack.addBook(book2);
        backpack.addBook(book3);
        backpack.printCurrentBook();
        System.out.println(backpack.noNoOfPages());
    }

}
