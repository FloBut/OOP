package SDA2_NO2;

import java.lang.reflect.Array;
import java.util.Scanner;

//  Scrie o functie care primeste un string,
//  in care exista mai multe cuvinte separate prin spatiu.
//Returneaza cel mai lung cuvant din acel string.
public class NO_4_MaxLenWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[]{"programez", "incet", "modele", "matematice"};
        System.out.println(maxLenWord(words));
    }
    // metoda va primi ca parametru o propozitie alcatuita din mai multe cuvintepe care le salvez intr - un sir
    // de stringuri si va returna cuvantul care are cel mai mare numar de litere
    // ex1: programez incet modele matematice -> matematice
    // ex2: ana are ace -> ana, toate cuvintele sunt egale dar va returna primul cuvant de lungime maxima
    public static String maxLenWord(String[] words) {
        int maxLen = 0;
        String lenMaxWord = "";
        for (int i = 0; i < words.length; i++) {
            String temp = String.valueOf(words[i]);
            if (maxLen < temp.length()) {
                maxLen = temp.length();
                lenMaxWord = temp;
            }
        }
        return lenMaxWord;
    }

}
