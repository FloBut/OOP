package Arrays;

import java.util.Arrays;

// 4. Scrie un program care sa inlocuiasca fiecare animal care incepe cu litera "B"
// cu "Lion", intr-un array de animale.
//ex: "urs", "leu", "jaguar", "Balena", "caine" ->  "urs", "leu", "jaguar", "Lion", "caine"
public class NO_4 {
    public static void main(String[] args) {
        String[] animalsList = new String[]{"urs", "leu", "jaguar", "Balena", "caine"};
        System.out.println(Arrays.toString(bToLion(animalsList)));
    }
    public static String[] bToLion(String[] animals) {
        String animal = "Lion";
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].toString().charAt(0) == 'B') {
                animals[i] = animal;
            }
        }
        return animals;
    }
}
