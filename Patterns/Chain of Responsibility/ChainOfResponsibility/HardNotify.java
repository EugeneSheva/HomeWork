package ChainOfResponsibility;

public class HardNotify extends Notify{

    public HardNotify(int priority) {
        super(priority);
    }

    @Override
    public void write(String massege) {
        System.out.println("Sending SMS: " + massege);

    }
}
