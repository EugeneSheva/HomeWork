package Strategy;

public class Main {
    public static void main(String[] args) {
        Citizen citizen = new Citizen(new Sleep());
        citizen.doIt();

        citizen.setActivity(new Run());
        citizen.doIt();

        citizen.setActivity(new Work());
        citizen.doIt();

        citizen.setActivity(new Learn());
        citizen.doIt();


        }
    }
