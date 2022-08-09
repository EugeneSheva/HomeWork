package Algoritms.t4equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите уравнение...");
        String s = scan.nextLine();
        Check.CheckExpression(s);
    }


}
