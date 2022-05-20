package State;

public class Main {
    public static void main(String[] args) {
        Activity sleep = new Sleep();
        Citizen citizen = new Citizen(sleep);

        for (int i = 0; i < 12; i++) {
            citizen.doIt();
            citizen.changeActivity();

        }
    }
}
