package Bridge;

public class MainProgramDev {
    public static void main(String[] args) {

        Program pb24 = new BankAPP(new Java());
        Program moneyExch = new CashExchange(new Pyton());
        Program oschad = new BankAPP(new Java());

        pb24 = new BankAPP(new Java());
        moneyExch = new CashExchange(new Pyton());
        oschad = new BankAPP(new Java());


        pb24.MakeProgram();
        moneyExch.MakeProgram();
        oschad.MakeProgram();

    }
}
