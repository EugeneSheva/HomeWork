public class TV implements SimpleDevice{
    @Override
    public void TurnOn() {
        System.out.println("TV is working");
    }

    @Override
    public void TurnOff() {
        System.out.println("TV off");

    }
}
