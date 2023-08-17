package EX_OOP.ex_7_ghiozdan.ghiozdan;

public class Backpack {
final int maxWeight;

int currentWeight;
Book[] books;
int noOfBooks;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
        this.books = new Book[30];
        this.noOfBooks = 0;
    }
    public boolean addBook(Book book) {
        if (currentWeight + book.weight > maxWeight) {
            return false;
        }
        books[noOfBooks++] = book;
        currentWeight = book.weight;
        return true;

    }
    public void printCurrentBook() {
        for (int i = 0; i < noOfBooks; ++i) {
            System.out.println(books[i]);
        }
    }
    public int noNoOfPages() {
        int sum = 0;
        for (int i = 0; i <noOfBooks; i++) {
            sum += books[i].numberOfPages;
        }
        return sum;
    }
}
