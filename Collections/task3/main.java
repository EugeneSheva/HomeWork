package Collections.task3;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите \"СПИСОК\" для просмотра списка.\n" +
                "Введите \"СТОП\" для отсановки программы.");
        for(;;) {
            System.out.println("Введите госномер авто.");
            String s = scanner.next();
            if (s.equalsIgnoreCase("СТОП")) {
                break;
            } else if (s.equalsIgnoreCase("СПИСОК")) {
                    System.out.println("Список:");
                    Iterator<String> i = list.iterator();
                    while (i.hasNext())
                        System.out.println(i.next());

            } else {
                list.add(s);
            }
        }
    }
}
