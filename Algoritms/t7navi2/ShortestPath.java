package Algoritms.t7navi2;

import java.util.Scanner;

public class ShortestPath {
    public static int size = 17;
    public static int start;
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
            printGraph();
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
            wasVisited[i] = false;
        }
        System.out.println("Введите начальную точку ");
        start = sc.nextInt();
        distance[start] = 0;
        ShortestPath p = new ShortestPath();
        p.dijkstra(0);
    }
}



