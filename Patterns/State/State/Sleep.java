package State;

public class Sleep implements Activity {
    @Override
    public void doing() {
        System.out.println("Sleeping...");
    }
}
