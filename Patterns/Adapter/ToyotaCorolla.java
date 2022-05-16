public class ToyotaCorolla extends Car {
    @Override
    public void StartEngine() {
        System.out.println("Fasten your seat belt");
        System.out.println("Press the brake pedal");
        System.out.println("press start/stop button");


    }

    @Override
    public void StopEngine() {
        System.out.println("put the gear selector in park mode");
        System.out.println("press start/stop button");
        System.out.println("Unfasten your seat belt");
    }
}
