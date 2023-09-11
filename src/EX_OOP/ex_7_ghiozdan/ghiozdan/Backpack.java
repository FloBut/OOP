package EX_OOP.ex_7_ghiozdan.ghiozdan;

public class Backpack {
     final int maxWeight;
     int actualWeight;
     Book[] books;
     int numberOfBooks;
     int numberOfPages;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
        this.actualWeight = 0;
        this.books = new Book[30];
        this.numberOfBooks = 0;
    }

    public boolean addBook(Book book) {
        //verifcam daca greutatea cartii este mai mare
        if ((actualWeight + book.weight) > maxWeight) {
            return false;
        }
        books[numberOfBooks++] = book;
        actualWeight +=book.weight;
        return true;
    }
//returnez numarul total de carti
    int getTotalPages() {
        int totalNoPages = 0;
        for (int i = 0; i < numberOfBooks; ++i) {
            totalNoPages += books[i].numberOfPages;
        }
        return totalNoPages;
    }
    //printez lista de carti adaugate
   public void printCurrentBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
   }
}
