package SDA2_NO2;

import java.util.Scanner;

//Scrie o functie care accepta un array bidimensional (o matrice) si doua numere: i si j.
//Interschimba coloanele cu indicii i si j din matrice.
//
//De exemplu, pentru matricea:
//
//11 12 13 14
//21 22 23 24
//31 32 33 3
//Daca vrem sa interschimba coloana 0 cu coloana 1, matricea va deveni:
//
//12 11 13 14
//22 21 23 24
//32 31 33 34
public class No_7_Matrice {
    public static void main(String[] args) {
        //citesc o matrice
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int p = scanner.nextInt();
        int lenMatrix = scanner.nextInt();
        int[][] matrix = new int[lenMatrix][lenMatrix];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //System.out.println(changeMatrix(k, p, matrix));

    // metoda va primi o matrice patratica  de n linii si n coloane si doua numere k si p  intre care se face interschimbarea pe coloana;
    // parcurg matricea pana cand indicele de coloana j este egal cu n
        // salvez intr-un sir temp valorile de pe coloana j;
        // valorile matricei de pe linia i si coloana j vor fi inlocuite cu valorile de pe linia i si coloana egala cu indicele p
        // valorile de pe linia i si coloana p vor fi inlocuite cu valorile matricei de pe linia i si sirul temporar
        // voi returna noua matrice;

    //public static int[][] changeMatrix(int k, int p, int[][] matrix) {
        int[] temp = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
//                if (j == k) {
//                    temp[j] = matrix[i][j];
//                    matrix[i][j] = matrix[i][p];
//                    matrix[i][p] = matrix[i][temp[j]];
//                }j
            }
        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//            }
//            System.out.println(" ");
//        }
        //return matrix;
    }

}
