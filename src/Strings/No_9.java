package Strings;

import java.util.Arrays;
import java.util.Scanner;

//### 9. Scrie un program care sa transforme in litera mare prima litera din fiecare cuvant dintr-un String citit de la tastatura.
//
//De exemplu, pentru String-ul "ana are mare", se va afisa "Ana Are Mere"
// ex: java este un limbaj de programare -> Java Este Un Limbaj De Programare
public class No_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.println(Arrays.toString(firstCharToUpper(words)));
    }

    // primesc de la tastura un text si fiecare litera a cuvantului va incepe cu litera mare
    //iau fiecare cuvant si il salvez pe o pozitie a unui sir
    //parcurg sirul de cuvinte si prima litera a unui cuvant o transform in litera mare
        //mai intai transform in litera mare fiecare litera a fiecarui cuvant si o salvez intr-un string
        // scot prima litera mica a fiecarui cuvant si cuvantul nou obtinut il retin intr - un string
        // suprascriu cuvantul din sir concatenand in el litera mare obtinuta si cuvintul fara prima litera
        //returnez sirul de cuvinte
        //// ex: java este un limbaj de programare -> Java Este Un Limbaj De Programare
        public static String[] firstCharToUpper(String words) {
        String[] eachWord = words.split(" ");
        for (int i = 0; i < eachWord.length; ++i) {
            String firstChar = eachWord[i].substring(0,1).toUpperCase();
            String restWord = eachWord[i].substring(1,eachWord[i].length());
            eachWord[i] = firstChar+restWord;
        }
       return eachWord;

    }
}
