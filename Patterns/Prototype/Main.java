package HomeWork.Patterns.Prototype;

public class Main {
    public static void main(String[] args) {
    Box box1 = new Box(15,10);
    Box clone = box1.clone();
        System.out.println(clone);
    }
}
