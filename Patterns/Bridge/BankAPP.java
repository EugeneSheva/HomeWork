public class BankAPP extends Program{
    protected BankAPP(Developer developer) {
        super(developer);
    }

    @Override
    public void MakeProgram() {
        System.out.println("Bank APP development in progress...");
        developer.WriteCode();
    }
}
