package Collections.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите \"СПИСОК\" для просмотра списка.\n" +
                "Введите \"СТОП\" для отсановки программы.");
        for(;;) {
            System.out.println("Введите госномер авто.");
            String s = scanner.next();
            if (s.equalsIgnoreCase("СТОП")) {
                break;
            } else if (s.equalsIgnoreCase("СПИСОК")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }

            } else {
                list.add(s);
            }
        }
    }
}
