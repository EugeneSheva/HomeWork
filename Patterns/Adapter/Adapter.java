public class Adapter implements SimpleDevice {
   Car car;

    public Adapter(Car car) {
        this.car = car;
    }

    @Override
    public void TurnOn() {
        car.StartEngine();
    }

    @Override
    public void TurnOff() {
        car.StopEngine();
    }
}
