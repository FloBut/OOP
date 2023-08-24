package Strings;
//### 7.Scrie un program care sa afiseze in consola daca un cuvant este palindrom sau nu.
//
//Un cuvant sau numar este palindrom daca este egal cu inversul lui\
//De exemplu, ana este palindrom, dar mama nu este palindrom pt ca mama este diferit de inversul sau (amam)
//asa -> true; assa- > true;  casa -> flse



import java.util.Scanner;

public class NO_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(palindrom(word));
        // citesc un cuvant si verific daca primul caracter este acelasi cu ultimul caracter,
        // apoi al doilea caracter este egal cu penultimul si daca sunt egale pana la mijloc atunci cuvantul este palindrom
    }

    public static boolean palindrom(String word) {
        //parcurg cuvantul si fiecare litera din prima jumatate o compar cu litera aflata in oglinda din a doua jumatate
        // daca sunt diferite atunci returnez false
        //daca nu am returnat valoarea false atunci cuvantul este palindrom
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
