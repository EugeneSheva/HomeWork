public class MainDecorator {
    public static void main(String[] args) {
    CarDec fordFocus = new FordFocus();
        System.out.println(fordFocus.getInfo());
        System.out.println(fordFocus.getPrice());

        fordFocus = new GPS(fordFocus);
        System.out.println(fordFocus.getInfo());
        System.out.println(fordFocus.getPrice());

        fordFocus = new ClimatControl(fordFocus);
        System.out.println(fordFocus.getInfo());
        System.out.println(fordFocus.getPrice());

    CarDec fordMondeo = new FordMondeo();
        System.out.println(fordMondeo.getInfo());
        System.out.println(fordMondeo.getPrice());

    fordMondeo = new ClimatControl(fordMondeo);
        System.out.println(fordMondeo.getInfo());
        System.out.println(fordMondeo.getPrice());

    }
}
