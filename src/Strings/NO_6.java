package Strings;

import java.util.Scanner;

//6. Scrie un program care citeste de la tastatura un String si ii inverseaza caracterele.
//De exemplu, String-ul "java" devine "avaj".

//ideea e buna, dar cred ca nu ai definit bine input-ul si outpt-ul
//[16:34]
//tu iti initializezi un array de string-uri gol: (edited)
//[16:34]
//String[] wordToReverse = new String[word.length()];
//[16:35]
//si apoi parcurgi acest arai de striguri gol:
//[16:35]
//for (int i = 0; i < wordToReverse.length; i++) {
//            char c = word.charAt(i);
//            wordToReverse[i] = String.valueOf(c);
//        }
//[16:35]
//in primu rand, de ce array de string-uri?
//[16:35]
//
//[16:35]
//se poate ca problema sa fi fost ca nu ti-ai facut bine planul
//[16:36]
//un pseudocod clar cu: input , pasii de rezolvare, output
public class NO_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.print(reverse(word));
        // primesc un string si inversez ordinea caracterleor astfel:
        //primul caracter din cuvant cu ultimul caracter din celasi cuvant,
        // al doilea caracter din cuvant cu penultimul  caracter pana cand inversez toate caracterele cuvantului
        //exemplu:  programare -> eramargorp;  java -> avaj

        //System.out.println(Arrays.toString(reverse(word)));
    }
    //creez o metoda care primeste ca parametru cuvantul meu care este de tip String si va returna cuvantul inversat(String)


    public static String reverse(String word) {
        //initializez un string nou cu ultimul caracter din cuvantul primit ca parametru
        String reverseWord = String.valueOf(word.charAt(word.length() - 1));
        // parcurg cuvantul primit ca parametru si iau fiecare litera din cuvantul primit ca parametru si il adaug la cuvantul nou creat
        for (int i = word.length() - 2; i >= 0; --i) {
            reverseWord = reverseWord + word.charAt(i);
        }
        return reverseWord;
    }
}
