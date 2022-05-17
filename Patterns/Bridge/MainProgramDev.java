public class MainProgramDev {
    public static void main(String[] args) {
        Program pb24 = new BankAPP(new JavaDeveloper());
        Program moneyExch = new CashExchange(new Pyton());
        Program oschad = new BankAPP(new JavaDeveloper());

        pb24.MakeProgram();
        moneyExch.MakeProgram();
        oschad.MakeProgram();

    }
}
