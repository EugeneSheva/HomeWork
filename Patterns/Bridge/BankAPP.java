public class BankAPP extends Program{
    protected BankAPP(Dev developer) {
        super(developer);
    }

    @Override
    public void MakeProgram() {
        System.out.println("Bank APP development in progress...");
        developer.WriteCode();
    }
}
