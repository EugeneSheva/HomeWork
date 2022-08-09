package Algoritms.t6sortedAlgoritms;

import java.util.Arrays;
import java.util.Date;

public class CocktailSort {
    public static void CocktailSort(int[] arr) {  //сортировка перемешиванием, сложность On-On2.
        int[] array = arr.clone();
        Date first = new Date();
        boolean isSwapped = true;
        int start = 0;
        int end = array.length;

        while (isSwapped == true) {
            isSwapped = false;
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false)
                break;
            isSwapped = false;
            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwapped = true;
                }
            }
            start = start + 1;
        }
        Date last = new Date();
        System.out.println("\u001B[31m" + "CocktailSort.\n" + "\u001B[0m" + Arrays.toString(array) + "\n Time: " + (last.getTime() - first.getTime()));
    }
}
