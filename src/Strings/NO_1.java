package Strings;

import java.util.Scanner;

//### 1. Scrie un program care sa extraga prima jumatate a unui String de lungime para
//
//De exemplu, pentru "programmer", se va afisa in consola "progr".
public class NO_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(subStract(s));
    }

    public static String subStract(String s) {
        return s.substring(0,s.length()/2);
    }

}

