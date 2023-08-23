package Arrays;
//### 8. Scrie un program care sa inverseze toate cuvintele dintr-un text. Cuvintele sunt separate de spatii.
//
//De exemplu, pentru “This is Java” se va afisa: “Java is This”

import java.util.Arrays;
import java.util.Scanner;

public class NO_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        // primesc un text care se intinde pe o singura linie si vreau sa afisez cuvintele in ordine inversa
        //ma folosesc de un sir de stringuri in care voi salva pe fiecare pozitie din sir cate un cuvant cu ajutorul metodei
        // split cu care indepartez spatiile din string
        // si apoi afisez de la sfarsit la inceput sirul de cuvinte
        String[] newWords = words.split(" ");
        for (int i = newWords.length - 1; i >= 0; i--) {
            System.out.println(newWords[i]);
        }

    }
}
