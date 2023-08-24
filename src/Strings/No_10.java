package Strings;
//### 10. Scrie un program care printeaza in consola daca un String are caracterele in ordine alfabetica, sau nu.
//
//HINT: atunci cand compari 2 caractere folosind operatorul "<", afli daca ele sunt in ordinea alfabetica.\
//De exemplu, expresia 'a'<'b' va returna true, dar 'b'<'a' va returna false.

import java.util.Scanner;

public class No_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (alphabeticalOrder(word) == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    //primesc un cuvant si verifica daca literele lui sunt in ordine alfabetica
        //parcurg cuvantul si i-au literele pe rand si le convertesc in valoarea intreaga a caracterului ASCII
        // si apoi le compar ca pe pe niste valori intregi
        // daca valoarea intreaga a primei litere comparate este mai mare decat valoarea intreaga
        // a urmatoarei litere comparate atunci returnez 0 si opresc compararea
        //daca literele sunt in ordine lexicografica atunci metoda va returna valoarea 1 si afisez "adevarat"
        // ex: abcdezxy -> false; cdefghi -> true

    public static int alphabeticalOrder(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            int firstC = (int) (word.charAt(i));
            int secondC = (int) (word.charAt(i + 1));
            if (firstC > secondC) {
                return 0;
            }
        }
        return 1;
    }

}
