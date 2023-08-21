package Arrays;
// ### 2. Scrie un program care sa concateneze doua String-uri, mai putin primul caracter din fiecare
//
//Pentru  "Java" si "Fundamentals", se va afisa in consola "avaundamentals".

import java.util.Scanner;

public class NO_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(concatTwoStrings(s1,s2));

    }
    //metoda primeste ca parametru doua stringuri si mai intai elimina primul caracter idn fiecare string
    // returneaza cele doua stringuri concatenate
    public static String concatTwoStrings (String s1, String s2) {
        s1 = s1.substring(1,s1.length());
        s2 = s2.substring(1,s2.length());
        return(s1 + s2);
    }
}
