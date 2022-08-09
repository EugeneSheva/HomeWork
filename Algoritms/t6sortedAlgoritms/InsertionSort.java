package Algoritms.t6sortedAlgoritms;

import java.util.Arrays;
import java.util.Date;

public class InsertionSort {
    static void InsertionSort(int[] arr) { //сортировка вставками, сложность On-On2.
        int[] array = arr.clone();
        Date first = new Date();
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        Date last = new Date();
        System.out.println("\u001B[31m" + "InsertionSort.\n" + "\u001B[0m" + Arrays.toString(array) + "\n Time: " + (last.getTime() - first.getTime()));
    }
}
