package Strings;

import java.util.Scanner;

//### 12. Scrie un program prin care utilizatorul sa introduca de la tastatura hobby-uri ca String-uri, pana cand introduce cuvantul “stop” sau “exit”.
//
//Utilizatorul poate introduce maxim 10 hobby-uri. Fiecare hobby este adaugat intr-un array de String-uri.\
//La sfarsit, cand utilizatorul a introdus “stop” sau “exit”, se vor afisa in consola toate hobby-urile din array.
public class NO_12 {

    // declar un sir de stringuri cu lungimea de 10 si cat timp citesc introduc cuvintele in sir
    // daca introduc mai mault de 10 cuvinte in sir primesc o eroare ca am depasit lungimea sirulul declarat
    // daca introduc cuvantul "exit sau stop atunci afisez doar cuvintele introduse
    // alerg, citesc, scriu, codez, dansez, exit - > [alerg, citesc, scriu, codez, dansez]
    // alerg, citesc, scriu, codez, stop -> [alerg, citesc, scriu, codez, stop]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hobby = new String[9];
        int index = 0;
        boolean out = true;
        while (scanner.hasNext() && out == true) {
            String input = scanner.next();
            if ((!input.equals("stop")) && (!input.equals("stop"))) {
                hobby[index++] = input;
            } else {
                out = false;
            }
        }
        scanner.close();
        for (int i = 0; i < index; ++i) {
            System.out.println(hobby[i]);
        }
    }
}
