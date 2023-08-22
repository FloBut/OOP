package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//6. Scrie un program care citeste de la tastatura un String si ii inverseaza caracterele.
//De exemplu, String-ul "java" devine "avaj".
public class NO_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(Arrays.toString(reverse(word)));
    }

    public static String[] reverse(String word) {
        String[] wordToReverse = new String[word.length()];
        String[] wordReverse = new String[word.length()];
        int index = 0;
        for (int i = 0; i < wordToReverse.length; i++) {
            char c = word.charAt(i);
            wordToReverse[i] = String.valueOf(c);
        }
        for (int i = wordToReverse.length - 1; i >= 0; --i) {
            wordReverse[index++] = wordToReverse[i];
        }
        return wordReverse;
    }
}
