package EX_OOP.ex_7_ghiozdan.ghiozdan;

public class Main {
    public static void main(String[] args) {
        //ca sa apelez addbook am nevoie de un ghiozdan
        Backpack backpack = new Backpack(100);
        //imi trebe o carte ca sa pot apela metoda din clasa backpack
        Book book1 = new Book("carte1",200, 5);
        Book book2 = new Book("carte2",400, 50);
        Book book3 = new Book("carte3",300, 16);
        //vrea sa apelez metoda pe o carte si atunci trebuie sa imi fac o carte book1
        backpack.addBook(book1);
        System.out.println(backpack.addBook(book3));
        backpack.printCurrentBooks();
        System.out.println(backpack.getTotalPages());

    }


}
