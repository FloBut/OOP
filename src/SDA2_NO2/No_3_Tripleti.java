package SDA2_NO2;

import java.util.Scanner;

// Scrie un program care citește un șir de numere întregi și afișează numărul de "triplete" din șir.
//Un "triplet" reprezintă trei numere întregi consecutive în ordine crescătoare, care diferă cu  1 (de exemplu, 3,4,5
// este un triplet, dar 5,4,3 și 2,4,6 nu sunt).
public class No_3_Tripleti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenOfArray = scanner.nextInt();
        int[] numbers = new int[lenOfArray];
        for (int i = 0; i < lenOfArray; ++i) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(increaseConsecutive(numbers));
    }
    //parcurg sirul de numere si verific daca secventa de 3 numere asezate pe
    //pozitii consecutive sunt in ordine crescatoare consecutiva
    //ex: 1 5 8 6 7 4 3 1 2 3 5 -> 1 (1 2 3)
    //ex: 2 7 8 5 -> 0 (nu am o secventa de 3 numere crescatoare consecutive

    public static int increaseConsecutive(int[] numbers) {
        int tripletSeqNo = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
           if ((numbers[i] + 1 == numbers[i + 1]) && (numbers[i + 1]  == numbers[i + 2] - 1)) {
               ++tripletSeqNo;
           }
        }
       return tripletSeqNo;
    }

}
