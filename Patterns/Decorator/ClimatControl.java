public class ClimatControl extends Decorator{
    CarDec carDec;

    public ClimatControl(CarDec carDec) {
        this.carDec = carDec;
    }

    @Override
    public int getPrice() {
        return carDec.getPrice() + 1700;
    }

    @Override
    public String getInfo() {
        return carDec.getInfo() + "+ Climat Control";
    }
}