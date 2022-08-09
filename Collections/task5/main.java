package Collections.task5;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> link = new LinkedList<>();
        System.out.print("Add 1mil to ArrayList ");
        createAndAdd1Mill(arr);
        System.out.print("Add 1mil to LinkedList ");
        createAndAdd1Mill(link);
        System.out.println();
        System.out.print("Add in middle ArrayList ");
        addinMiddle(arr);
        System.out.print("Add in middle LinkedList ");
        addinMiddle(link);
        System.out.println();
        System.out.print("Add in end ArrayList ");
        addinEnd(arr);
        System.out.print("Add in end LinkedList ");
        addinEnd(link);
        System.out.println();
        System.out.print("Get from middle ArrayList ");
        getFromMiddle(arr);
        System.out.print("Get from middle LinkedList ");
        getFromMiddle(link);
        System.out.println();
        System.out.print("Get from end ArrayList ");
        getFromEnd(arr);
        System.out.print("Get from end LinkedList ");
        getFromEnd(link);
        System.out.println();
        System.out.print("Delete from end ArrayList ");
        dellFromEnd(arr);
        System.out.print("Delete from end LinkedList ");
        dellFromEnd(link);
        System.out.println();
        System.out.print("Delete from middle ArrayList ");
        dellFromMiddle(arr);
        System.out.print("Delete from middle LinkedList ");
        dellFromMiddle(link);
        System.out.println();

        System.out.print("Get by value ArrayList ");
        getByValue(arr);
        System.out.print("Get by value LinkedList ");
        getByValue(link);
        System.out.println();



    }
    public static void getByValue (List list) {
        Date first = new Date();
        int a = list.indexOf(100);
        Date last = new Date();
        System.out.print(a+": ");
        System.out.println(last.getTime() - first.getTime());
    }
    public static void dellFromEnd (List list) {
        Date first = new Date();
        list.remove(list.size()-1);
        Date last = new Date();
        System.out.println(last.getTime() - first.getTime());
    }
    public static void dellFromMiddle (List list) {
        Date first = new Date();
        list.remove(list.size() / 2);
        Date last = new Date();
        System.out.println(last.getTime() - first.getTime());
    }
    public static void getFromMiddle (List list) {
        Date first = new Date();
        list.get(list.size() / 2);
        Date last = new Date();
        System.out.println(last.getTime() - first.getTime());
    }
    public static void getFromEnd (List list) {
        Date first = new Date();
        list.get(list.size()-1);
        Date last = new Date();
        System.out.println(last.getTime() - first.getTime());
    }
    public static void addinMiddle (List list) {
        Date first = new Date();
        list.add(list.size()/2,100);
        Date last = new Date();
        System.out.println(last.getTime() - first.getTime());
    }
    public static void addinEnd (List list) {
        Date first = new Date();
        list.add(200);
        Date last = new Date();
        System.out.println(last.getTime() - first.getTime());
    }
    public static void createAndAdd1Mill (List list) {
        Date first = new Date();
        for (int i = 0; i < 1_000_000; i++) {
            Integer r = (int) (Math.random()*10000) -1000;
            list.add(String.valueOf(r));
        }
        Date last = new Date();
        System.out.println(last.getTime() - first.getTime());

    }
}
