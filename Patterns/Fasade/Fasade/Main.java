package Fasade;

public class Main {
    public static void main(String[] args) {
        FasadeSecurity fasadeSecurity = new FasadeSecurity();
        fasadeSecurity.on();
        fasadeSecurity.getStatus();
        fasadeSecurity.off();
        fasadeSecurity.getStatus();
    }

}
