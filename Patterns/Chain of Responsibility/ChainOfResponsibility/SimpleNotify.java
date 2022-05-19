package ChainOfResponsibility;

public class SimpleNotify extends Notify{

    public SimpleNotify(int priority) {
        super(priority);
    }

    @Override
    public void write(String massege) {
        System.out.println("Using simple report: " + massege);

    }
}
