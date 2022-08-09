package Collections.task6.Comparable;

import java.util.*;

class Person implements Comparable<Person> {
    int number;
    String name;
    String surname;
    int age;

    public Person(int number, String name, String surname, int age) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.number - p.number;
    }

    @Override
    public String toString() {
        return "\n"+"Number: "+number+". Surname, Name: "+surname+" "+name+", Age: "+age;
    }
}

public class main {
    public static void main(String[] args) {
        List<Person> set = new ArrayList<>();
        set.add(new Person(9,"Ivan", "Petrenko",30));
        set.add(new Person(8,"Andrei", "Semenenko",25));
        set.add(new Person(1,"Ehor", "Shevchenko",34));
        set.add(new Person(3,"Anton", "Zelenskiy",43));
        set.add(new Person(2,"Zamir", "Aliev",23));
        set.add(new Person(6,"Pavel", "Ivanov",26));
        set.add(new Person(5,"Sergey", "Timko",28));
        set.add(new Person(7,"Evghen", "Bondarenko",32));
        set.add(new Person(10,"Timur", "Smirnov",33));
        set.add(new Person(4,"Stepan", "Miron",40));

        System.out.println(set);
        Collections.sort(set);
        System.out.println(set);


    }
}

