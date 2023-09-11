package SDA2_NO2;
//5. Scrie o functie care primeste un array si un numar n.
//Returneaza decate ori apare numarul n in array.
//
//Acum transforma functia in felul urmator: functia va primi, in plus si un numar k.
// Returneaza index-ul celei de-a k aparitii a numarului n in array.
// De exemplu, pentru 19 14 17 15 17, indexul celei de-a 2-a aparitii a lui 17 in array este 5.

import java.util.Scanner;

public class No_5_Aparitii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = {5, 7, 9, 7, 14, 6, 7, 13, 7, 28};
        System.out.println(appearNo(n, numbers));
        System.out.println(positionNo(n, k, numbers));
    }
    //metoda va primi un sir de numere intregi, un numar n si va returna numrul de aparitii a lui n in sir
    //parcurg sirul si daca numarul n este gasit in sirul de frecventa incrementez un contor
    //returnez contorul
    //ex: n = 7, k = 3, sirul: 5, 7, 9, 7, 14, 6, 7, 13, 7, 28 va returna 4 ca sunt 4 aparitii in sir si pozitia 6,
    // pe pozitia 6 apare a treia oara
    public static int appearNo(int n, int[] arrayNo) {
        int noOfAppear = 0;
        for (int i = 0; i < arrayNo.length; ++i) {
            if (n == arrayNo[i]) {
                ++noOfAppear;
            }
        }
        return noOfAppear;
    }
    // metoda va primi un sir de numere intregi, un numar n si un numar k si va returna
    // pozitia pe care se afla numarul n in sirul de numere intregi care a aparut de k ori
    public static int positionNo(int n, int k, int[] arrayNo) {
        int noOfAppear = 0;
        int position = -1;
        for (int i = 0; i < arrayNo.length; ++i) {
            if (n == arrayNo[i]) {
                ++noOfAppear;
                if (noOfAppear == k) {
                    position = i;
                }
            }
        }
        return position;

    }
}
