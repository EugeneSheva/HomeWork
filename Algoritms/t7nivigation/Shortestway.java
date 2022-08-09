package Algoritms.t7navi2;

import java.util.Scanner;

public class Shortestway {
    public static int size = 17;
    public static int start;
    public static  int finish;
    public static int distance[] = new int[size];
    public static Boolean wasVisited[] = new Boolean[size];
    public static int graph[][] = new int [][] {
//             0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16
            {  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,160,  0,  0,122}, // 0  Винница
            {  0,  0,  0,  0,146,245,  0,  0,  0,  0,  0,  0,  0,  0,216,  0,  0}, // 1  Днепр
            {  0,  0,  0,140,  0,  0,  0,  0,  0,  0,188,  0,  0,  0,  0,  0,  0}, // 2  Житомир
            {  0,  0,140,  0,  0,  0,  0,  0,  0,342,  0,  0,  0,212,  0,  0,  0}, // 3  Киев
            {  0,146,  0,  0,  0,119,  0,204,  0,  0,  0,  0,  0,  0,  0,  0,  0}, // 4  Кривой Рог
            {  0,245,  0,  0,119,  0,  0,  0,  0,  0,  0,  0,  0,167,  0,  0,  0}, // 5  Кропивницкий
            {  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,121,  0,127,  0,  0,  0,  0}, // 6  Львов
            {  0,  0,  0,  0,204,  0,  0,  0,132,  0,  0,  0,  0,  0,  0, 71,  0}, // 7  Николаев
            {  0,  0,  0,  0,  0,  0,  0,132,  0,  0,  0,  0,  0,271,  0,  0,  0}, // 8  Одесса
            {  0,  0,  0,342,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,143,  0,  0}, // 9  Полтава
            {  0,  0,188,  0,  0,  0,121,  0,  0,  0,  0,  0,159,  0,  0,  0,  0}, // 10 Ровно
            {  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,183,  0,  0}, // 11 Суммы
            {  0,  0,  0,  0,  0,  0,127,  0,  0,  0,159,  0,  0,  0,  0,  0,111}, // 12 Тернополь
            {160,  0,  0,212,  0,167,  0,  0,271,  0,  0,  0,  0,  0,  0,  0,  0}, // 13 Умань
            {  0,216,  0,  0,  0,  0,  0,  0,  0,143,  0,183,  0,  0,  0,  0,  0}, // 14 Харьков
            {  0,  0,  0,  0,  0,  0,  0, 71,  0,  0,  0,  0,  0,  0,  0,  0,  0}, // 15 Херсон
            {122,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,111,  0,  0,  0,  0}  // 16 Хмельницкий
    };


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
            wasVisited[i] = false;
        }
        System.out.println("Введите начальный город: ");
        String startcity = sc.next();
        start = CityByNumber(startcity);
        distance[start] = 0;
        Shortestway p = new Shortestway();
        p.dijkstra(0);
        System.out.println("Введите город назначения: ");
        String finishcity = sc.next();
        finish = CityByNumber(finishcity);
        System.out.println("Расстояние от города " + startcity + " до города "+ finishcity + " оставляет "+ distance[finish] + "км.");
        way();
    }


    public int minDastance() {
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < distance.length; i++) {
            if (minDistance > distance[i] && wasVisited[i] == false) {
                minDistance = distance[i];
                index = i;
            }
        }
        return index;
    }


    public void  printGraph() {
        System.out.println("Расстояние до точки назначения: ");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " - " + distance[i]);
        }
    }


    public void dijkstra (int start){
        for (int count = 0; count < size; count++)
        {
            int u = minDastance();
            wasVisited[u] = true;
            for (int x = 0; x < distance.length; x++) {
                if (!wasVisited[x] && graph[u][x] != 0 && distance[u] != Integer.MAX_VALUE && distance[u] + graph[u][x] < distance[x]) {
                    distance[x]=distance[u] + graph[u][x];
                }
            }
        }
        printGraph();
    }


    public static void way(){
        int[] wayArr = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int end = finish;
        wayArr[0]=end;
        int k = 1;
        int tmp;
        int weight = distance[finish];
            while (end!=start) {
                for (int i = 0; i < size; i++) {
                    if (graph[i][end] != 0) {
                        tmp = weight - graph[i][end];
                        for (int j = 0; j <distance.length; j++) {
                            if (tmp == distance[j]) {
                                weight = tmp;
                                end = j;
                                wayArr[k]= j;
                                k++;
                            }

                        }

                    }
                }
            }
        System.out.println("Маршрут проложен по городам:");
        for (int i = wayArr.length-1; i >= 0; i--) {
            System.out.print(NumberByCity(wayArr[i]).trim()+" ");

        }

    }


    public static int CityByNumber(String city) {
        if (city.equalsIgnoreCase("Винница")) return 0;
        else if (city.equalsIgnoreCase("Днепр")) return  1;
        else if (city.equalsIgnoreCase("Житомир")) return  2;
        else if (city.equalsIgnoreCase("Киев")) return  3;
        else if (city.equalsIgnoreCase("Кривой Рог")) return  4;
        else if (city.equalsIgnoreCase("Кропивницкий")) return  5;
        else if (city.equalsIgnoreCase("Львов")) return  6;
        else if (city.equalsIgnoreCase("Николаев")) return  7;
        else if (city.equalsIgnoreCase("Одесса")) return  8;
        else if (city.equalsIgnoreCase("Полтава")) return  9;
        else if (city.equalsIgnoreCase("Ровно")) return  10;
        else if (city.equalsIgnoreCase("Суммы")) return  11;
        else if (city.equalsIgnoreCase("Тернополь")) return  12;
        else if (city.equalsIgnoreCase("Умань")) return  13;
        else if (city.equalsIgnoreCase("Харьков")) return  14;
        else if (city.equalsIgnoreCase("Херсон")) return  15;
        else if (city.equalsIgnoreCase("Хмельницкий")) return  16;
        else
        return -1;
    }


    public static String NumberByCity(int numb) {
        String cityName = "";
        if (numb>0) {
            if (numb == 0) cityName = "Винница";
            else if (numb == 1) cityName = "Днепр";
            else if (numb == 2) cityName = "Житомир";
            else if (numb == 3) cityName = "Киев";
            else if (numb == 4) cityName = "Кривой Рог";
            else if (numb == 5) cityName = "Кропивницкий";
            else if (numb == 6) cityName = "Львов";
            else if (numb == 7) cityName = "Николаев";
            else if (numb == 8) cityName = "Одесса";
            else if (numb == 9) cityName = "Полтава";
            else if (numb == 10) cityName = "Ровно";
            else if (numb == 11) cityName = "Суммы";
            else if (numb == 12) cityName = "Тернополь";
            else if (numb == 13) cityName = "Умань";
            else if (numb == 14) cityName = "Харьков";
            else if (numb == 15) cityName = "Херсон";
            else if (numb == 16) cityName = "Хмельницкий";

        }
        return cityName;
    }
}



