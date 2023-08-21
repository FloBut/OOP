package Arrays;


import java.util.Scanner;

//3. Scrie un program care citeste de la tastatura un String
// si il afiseaza in consola consola caracter cu caracter (cate un caracter pe fiecare linie)
public class NO_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        eachLetter(s);
    }

    public static void eachLetter(String s) {
        char c;
        for (int i = 0; i < s.length(); ++i) {
            System.out.println(c = s.charAt(i));
        }

    }
}
