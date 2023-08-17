package EX_OOP.ex_7_ghiozdan.ghiozdan;
// Clasa Book va avea atributele:
//* title
//* numberOfPages
//* Weight
//
//Clasa Backpack va avea atributele:
//* maxWeight
//* currentWeight
//* bookList (un array de maxim 30 de carti)
//* numberOfBooks (numarul curent de carti din bookList)
//Clasa Backpack va avea urmatoarele functionalitati:
//* getTotalPages() - va returna numarul total de pagini ale tuturor cartilor din ghiozdan
//* getCurrentBooks() - va returna lista de carti care sunt in ghiozdan
//* addBook() - va adauga o carte in ghiozdan, daca adaugarea ei nu depaseste greutatea maxima
public class Book {
    String Title;
    int numberOfPages;
    int weight;

    public Book(String title, int numberOfPages, int weight) {
        this.Title = title;
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", weight=" + weight +
                '}';
    }
}
