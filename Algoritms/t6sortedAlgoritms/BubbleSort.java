package Algoritms.t6sortedAlgoritms;

import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
    static void BubbleSort(int[] arr) {  //сортировка пузырьком, сложность On-On2.
        int[] array = arr.clone();
        Date first = new Date();
        boolean isSorted = true;
        int temp;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = true;
                }
            }
        }
        Date last = new Date();
        System.out.println("\u001B[31m" + "BubleSort.\n" + "\u001B[0m" + Arrays.toString(array) + "\n Time: " + (last.getTime() - first.getTime()));
    }
}
