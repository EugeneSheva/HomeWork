package Bridge;

public class MainProgramDev {
    public static void main(String[] args) {

        Program pb24;
        Program moneyExch;
        Program oschad;

        pb24 = new BankAPP(new Java());
        moneyExch = new CashExchange(new Pyton());
        oschad = new BankAPP(new Java());


        pb24.MakeProgram();
        moneyExch.MakeProgram();
        oschad.MakeProgram();

    }
}
