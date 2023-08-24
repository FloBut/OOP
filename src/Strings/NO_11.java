package Strings;

import java.util.Scanner;

//### 11. Scrie un program care citeste de la tastatura numele complet al unui om si ii afiseaza initialele.
//
//De exemplu, pentru String-ul "Stefan I. Olimpiu", se va afisa "SIO".\
//HINT: foloseste metoda split() pentru a "sparge" string-ul intr-un array a carui elemente sa fie toate numele din numele complet.
public class NO_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(nameToInitial(name));
    }


    // convertesc numele citit de la tastaura in intiale scrise cu litere mari
    //iau numele si prenumele si il pun intr-un sir de stringuri si apoi fiecare litera
    // cu care incepe numele si prenumele o afisez cu litera mare
    //ex: Marcela Ioana Constantin -> MIC

   public static String nameToInitial(String name) {
        String[] eachName = name.split(" ");
        String firstChar = "";
        for (int i = 0; i <eachName.length; i++) {
            firstChar += String.valueOf(eachName[i].charAt(0));

        }
        return firstChar;
    }
}
