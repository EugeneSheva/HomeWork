package Algoritms.t6sortedAlgoritms;

import java.util.Arrays;
import java.util.Date;

public class MergeSort {
    public static void MergeSort ( int[] arr) {  //сортировка выбором, сложность O(n logN)
        int[] array = arr.clone();
        Date first = new Date();
        MS(array, array.length);
        Date last = new Date();
        System.out.println("\u001B[31m" + "MergeSort.\n" + "\u001B[0m" + Arrays.toString(array) + "\n Time: " + (last.getTime() - first.getTime()));
    }
    public static void MS(int[] a, int n) {
        if (n<2) return;
        int mid = n/2;
        int[] l= new int[mid];
        int[] r= new int[n-mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i <n ; i++) {
            r[i-mid] = a[i];
        }
        MS(l,mid);
        MS(r,n-mid);

        Merge (a, l, r, mid, n-mid);

    }
    public static void Merge (int[]a, int[]l, int[]r,int left, int right) {
        int i=0, j=0,k=0;
        while (i<left && j < right) {
            if(l[i]<=r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i<left) {
            a[k++] = l[i++];
        }
        while (j<right) {
            a[k++] = r[j++];
        }

    }
}
