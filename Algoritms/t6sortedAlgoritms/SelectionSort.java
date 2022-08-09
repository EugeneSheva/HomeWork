package Algoritms.t6sortedAlgoritms;

import java.util.Arrays;
import java.util.Date;

public class SelectionSort {
    static void SelectionSort(int[] arr) {  //сортировка выбором, сложность On-On2.
        int[] array = arr.clone();
        Date first = new Date();
        for (int i = 0; i < array.length; i++) {
            int position = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    position = j;
                    min = array[j];
                }
            }
            array[position] = array[i];
            array[i] = min;
        }
        Date last = new Date();
        System.out.println("\u001B[31m" + "SelectionSort.\n" + "\u001B[0m" + Arrays.toString(array) + "\n Time: " + (last.getTime() - first.getTime()));
    }
}
