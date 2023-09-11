package SDA2_NO2;

import java.util.Scanner;

//. Scrie un program care citește un șir de numere întregi și două numere n și m.
// Programul trebuie să verifice că n și m nu apar niciodată
// unul lângă celălalt (în orice ordine) în șir.
public class No_2_Vecinii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] numbers = {1, 3, 5, 7, 9};
        //ex:n = 5, m = 7 sirul: 1 3 7 5 9 -> returnez false, 7 este vacin cu 5
        //ex:n = 5, m = 7 sirul: 7 3 4 5 8  -> returnez true, 5 si 7 nu sunt vecini

        boolean result = neighbours(n, m, numbers);
        System.out.println(result);
    }
    // construiesc o metoda care primeste ca parametri sirul de numere si cele doua numere m si n si va returna adevarat
    // daca cele doua numere nu sunt vecine
    // parcurg sirul de numere si verific unde se afla unul din cele 2 numere n sau m
        //daca il gasesc prima data pe n verific daca vecinul din dreapta sau vecinul din stanga este egal cu m,
        // caz in care returnez true
        //daca il gasesc prima data pe m verific daca vecinul din dreapta sau vecinul din stanga este egal cu m,
        // caz in care returnez true
    public static boolean neighbours(int n, int m, int[] numbers) {
        for (int i = 0; i < numbers.length; ++i) {
            if (n == numbers[i]) {
                if ((i != 0) || (i != numbers.length - 1)) {
                    if ((m == numbers[i - 1]) || (m == numbers[i + 1])) {
                        return false;
                    }
                }
            } else if (m == numbers[i]) {
                if ((i != 0) && (i != numbers.length - 1)) {
                    if (n == numbers[i - 1] || n == numbers[i + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
