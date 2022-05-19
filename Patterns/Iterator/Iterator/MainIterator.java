package Iterator;

public class MainIterator {
    public static void main(String[] args) {

        String[] skills = {"Java", "Spring", "SQL"};

        Developer developer = new Developer("Anton Petrov", skills);

        Iterator iterator = developer.getIterator();
        System.out.println("Developer: " + developer.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}
