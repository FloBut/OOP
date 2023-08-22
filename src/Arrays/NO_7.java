package Arrays;
//### 7.Scrie un program care sa afiseze in consola daca un cuvant este palindrom sau nu.
//
//Un cuvant sau numar este palindrom daca este egal cu inversul lui\
//De exemplu, ana este palindrom, dar mama nu este palindrom pt ca mama este diferit de inversul sau (amam)

import java.util.Objects;
import java.util.Scanner;

public class NO_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (palindrom(word)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    public static boolean palindrom(String word) {
        int index = 0;
        String[] firstHalf = new String[word.length()];
        for (int i = 0; i < word.length(); ++i) {
            firstHalf[index++] = String.valueOf(word.charAt(i));
        }
        int noChar = 0;
        for (int i = 0; i < firstHalf.length/2 ; ++i) {
            int last = firstHalf.length - 1 - i;
            if (firstHalf[i].equals(firstHalf[last])) {
                ++noChar;
            }
        }
        if (noChar == firstHalf.length/2) {
            return true;
        } else {
            return false;
        }
    }
}
