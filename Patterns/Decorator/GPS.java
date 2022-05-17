public class GPS extends Decorator{
    CarDec carDec;

    public GPS(CarDec carDec) {
        this.carDec = carDec;
    }

    @Override
    public int getPrice() {
        return carDec.getPrice() + 500;
    }

    @Override
    public String getInfo() {
        return carDec.getInfo() + "+ GPS";
    }
}
