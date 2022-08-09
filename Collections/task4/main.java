package Collections.task4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Map<String, String> list = new HashMap<>();
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
                Iterator <Map.Entry<String,String>> i = list.entrySet().iterator();
                while (i.hasNext())
                System.out.println(i.next());


            } else {
                System.out.println("Введите владельца.");
                String i = scanner.next();
                list.put(s,i);
                }
            }
        }
    }

