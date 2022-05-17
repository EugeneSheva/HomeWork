public class MainProgramDev {
    public static void main(String[] args) {
        Program pb24 = new BankAPP(new JavaDev());
        Program moneyExch = new CashExchange(new Pyton());
        Program oschad = new BankAPP(new JavaDev());

        pb24.MakeProgram();
        moneyExch.MakeProgram();
        oschad.MakeProgram();

    }
}
