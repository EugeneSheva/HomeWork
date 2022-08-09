package Algoritms.t6sortedAlgoritms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10_000];            //20_000
        for (int i = 0; i < arr.length; i++) {
            int temp = (int) (Math.random() * 10000);
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
        BubbleSort.BubbleSort(arr);
        CocktailSort.CocktailSort(arr);
        SelectionSort.SelectionSort(arr);
        InsertionSort.InsertionSort(arr);
        QuickSort.QuickSort(arr,0, arr.length-1);
        MergeSort.MergeSort(arr);
        ShellSort.ShellSort(arr);
    }

}
