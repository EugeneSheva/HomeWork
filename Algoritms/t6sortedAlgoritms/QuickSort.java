package Algoritms.t6sortedAlgoritms;

import java.util.Arrays;
import java.util.Date;

public class QuickSort {

    public static void QuickSort ( int[] arr, int low, int high) {  //быстрая сортировка, сложность O(n logN).
        int low1 = low;
        int high1 = high;
        int[] array = arr.clone();
        Date first = new Date();
        QS(array,low1,high1);
        Date last = new Date();
        System.out.println("\u001B[31m" + "QuickSort.\n" + "\u001B[0m" + Arrays.toString(array) + "\n Time: " + (last.getTime() - first.getTime()));
    }

public static void QS ( int[] array, int low, int high) {  //быстрая сортировка
    if (low >= high) return;
    int pivot = array[low + (high - low) / 2];

    int i = low, j = high;
    while (i <= j) {
        while (array[i] < pivot) {
            i++;
        }
        while (array[j] > pivot) {
            j--;
        }

        if (i <= j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    if (low < j) QS(array, low, j);
    if (high > i) QS(array, i, high);
    }
}
