package ChainOfResponsibility;

public class MiddleNotify extends Notify{

    public MiddleNotify(int priority) {
        super(priority);
    }

    @Override
    public void write(String massege) {
        System.out.println("Sending E-mail: " + massege);

    }
}
