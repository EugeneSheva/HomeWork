package Algoritms.t6sortedAlgoritms;

import java.util.Arrays;
import java.util.Date;

public class ShellSort {            //сортировка выбором, сложность O(n logN)-On2.
    public static void ShellSort(int []a) {

        Date first = new Date();
        int[] arr = a.clone();
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i += 1){
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
        Date last = new Date();
        System.out.println("\u001B[31m" + "ShellSort.\n" + "\u001B[0m" + Arrays.toString(arr) + "\n Time: " + (last.getTime() - first.getTime()));
    }
}
