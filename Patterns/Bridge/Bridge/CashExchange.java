package Bridge;

public class CashExchange extends Program{


    protected CashExchange(Developer developer) {

        super(developer);
    }

    @Override
    public void MakeProgram() {
        System.out.println("Cash exchange development in progress...");
        developer.WriteCode();
    }
}
