package Collections.task7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[10_000];            //20_000
        for (int i = 0; i < arr.length; i++) {
            int temp = (int) (Math.random() * 10000);
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        SelectionSort(arr);
        InsertionSort(arr);
        CocktailSort(arr);
        QuickSort(arr,0, arr.length-1);
    }


    static void BubbleSort(int[] arr) {  //сортировка пузырьком
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

    static void SelectionSort(int[] arr) {  //сортировка выбором
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

    static void InsertionSort(int[] arr) { //сортировка вставками
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


    public static void CocktailSort(int[] arr) {  //сортировка перемешиванием
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

    public static void QS ( int[] array, int low, int high){  //быстрая сортировка
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
    public static void QuickSort ( int[] arr, int low, int high) {  //быстрая сортировка
        int low1 = low;
        int high1 = high;
        int[] array = arr.clone();
        Date first = new Date();
        QS(array,low1,high1);
        Date last = new Date();
        System.out.println("\u001B[31m" + "QuickSort.\n" + "\u001B[0m" + Arrays.toString(array) + "\n Time: " + (last.getTime() - first.getTime()));


    }
}
