package ChainOfResponsibility;

public class MainChain {
    public static void main(String[] args) {
        Notify simple = new SimpleNotify(Priority.Low);
        Notify middle = new MiddleNotify(Priority.Middle);
        Notify hard = new HardNotify(Priority.Hihg);

        simple.setNextNotify(middle);
        middle.setNextNotify(hard);

        simple.notifyManeger("All is ok.", Priority.Low);
        System.out.println();
        simple.notifyManeger("Something wrong.", Priority.Middle);
        System.out.println();
        simple.notifyManeger("Fatal error", Priority.Hihg);
    }



}
