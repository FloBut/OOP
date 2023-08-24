package Strings;

import java.util.Arrays;

//5. Scrie un program care sa afiseze toate string-urile care au lungimea para dintr-un array de string-uri
public class NO_5 {
    public static void main(String[] args) {
        String[] wordsList = new String[]{"progam","cod", "invatare", "pseudocod", "algoritm"};
           System.out.println(Arrays.toString(oddLength(wordsList)));
    }
    // in alts tsring de cuvinte voi salva cuvintele pare din sirul pe care metoda il primeste ca parametru
   public static String[] oddLength (String[] words) {
        String[] oddWords = new String[words.length];
        int index = 0;
        for (int i = 0; i < words.length; ++i) {
            if (words[i].length() % 2 == 0) {
                 oddWords[index++] = words[i];
            }
        }
        return oddWords;
   }
}
