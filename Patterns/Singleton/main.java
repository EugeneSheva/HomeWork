package HomeWork.Patterns.Singleton;

public class main {
    public static void main(String[] args) {
        Singleton sn1 = Singleton.getInstance();
        sn1.setValue(20);

        Singleton sn2 = Singleton.getInstance();

        System.out.println(sn1);
        System.out.println(sn2);
        System.out.println(sn1 == sn2);

    }
}
