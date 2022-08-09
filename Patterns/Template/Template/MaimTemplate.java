package Template;

public class MaimTemplate {
    public static void main(String[] args) {
        Page welc = new WelcomePage();
        Page thank = new ThankYouPage();

        welc.showPage();
        System.out.println("=============");
        thank.showPage();
    }
}
