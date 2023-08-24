package Strings;

import java.util.Scanner;

//### 12. Scrie un program prin care utilizatorul sa introduca de la tastatura hobby-uri ca String-uri, pana cand introduce cuvantul “stop” sau “exit”.
//
//Utilizatorul poate introduce maxim 10 hobby-uri. Fiecare hobby este adaugat intr-un array de String-uri.\
//La sfarsit, cand utilizatorul a introdus “stop” sau “exit”, se vor afisa in consola toate hobby-urile din array.
public class NO_12 {
    //citesc cuvinte si le introduc intr-un sir de lungimea maxima 10 si le afisez apoi
        // declar un sir de stringuri cu lungimea de 10, un index pentru a introduce cuvintele citite si
        // o variabila de tip boolean pentru a verifica cand vor fi introduse cuvintele "stop" sau "exit" si
        // citesc cuvinte cat timp nu am introdus "stop" sau "exit" si lungimea sirului nu a ajuns la 10
        //introduc cuvintele in sir si afizez sirul
        // alerg, citesc, scriu, codez, dansez, exit - > [alerg, citesc, scriu, codez, dansez]
        // alerg, citesc, scriu, codez, stop -> [alerg, citesc, scriu, codez, stop]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hobby = new String[9];
        int index = 0;
        boolean out = true;
        while (out == true && scanner.hasNext() && index < 10) {
            String input = scanner.next();
            if (input.equals("stop") || input.equals("exit")) {
                out = false;
            } else {
                hobby[index++] = input;
            }
        }
        for (int i = 0; i < index; ++i) {
            System.out.println(hobby[i]);
        }
    }
}
