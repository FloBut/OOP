package SDA2_NO2;


import java.lang.reflect.Array;
import java.util.Arrays;

public class No_10_Palindromm {
    public static void main(String[] args) {
        char[] lettrs = {'a', 's', 'd', 's', 'a', 's'};
        System.out.println(Arrays.toString(getMaxSubPalindrom(lettrs)));
        System.out.println(getMaxSubPalindrom2(lettrs));
    }
    // varianta II
    // verific pentru litera curenta
        // daca litera din stanga ei este egala cu litera in drepta ei si nu am ajuns la unul din capete
        // compar lungimea palindromului gasit cu lungimea maxima
        // memorez pozitia de incept si pozitia de sfarsit a palindromului gasit

    public static String getMaxSubPalindrom2 (char[] letters) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < letters.length; i++) {
            int left = i;
            int right = i;
            if ((i + 1) < letters.length && (letters[i] == letters[i + 1])) {
                right = i + 1;
            }
            while (left >= 0 && right < letters.length && letters[left] == letters[right]) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
        }
        return new String(Arrays.copyOfRange(letters, start, end + 1));
    }


    public static char[] getMaxSubPalindrom(char[] letters) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < letters.length; ++i) {
            for (int j = i; j < letters.length; ++j) {
                if(isPalindrom(i , j, letters) && (j - i + 1) > maxLength) {
                    maxLength = j -i + 1;
                    start = i;
                    end = j;
                }
            }
        }
//        char[] result = new char[maxLength];
//        int position = 0;
//        for (int i = start; i <= end; ++i) {
//            result[position++] =  letters[i];
//        }
        return Arrays.copyOfRange(letters, start, end + 1);
    }
    public static boolean isPalindrom(int i, int j, char[] letter) {
        while (i < j) {
            if (letter[i] != letter[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
