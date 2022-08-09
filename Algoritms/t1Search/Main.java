package Algoritms.t1Search;

import javax.security.sasl.SaslClient;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int s = scan.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            int r = (int) (Math.random() * 100);
            arr[i] = r;
            System.out.print("arr[" + i + "] = " + r + " ,");
        }
        System.out.println("\nВведите искомое число: ");
        int f = scan.nextInt();
        findLine(arr,f);
    }


    public static int findLine(int[] arr, int f) {
        Date first = new Date();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] == f) {
                Date last = new Date();
                System.out.println("Искомое число (" + f + ") находится под индексом: " + i + ". Поиск произведен за " + count + " шагов.");
                System.out.println("Потрачено времени: "+(last.getTime() - first.getTime())+"мс.");
                return i;
            }
        }
        Date last = new Date();
        System.out.println("Искомое число не найдено.");
        System.out.println("Потрачено времени: "+(last.getTime() - first.getTime())+"мс.");
        return -1;

    }

}
