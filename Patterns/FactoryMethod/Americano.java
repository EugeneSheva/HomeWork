package HomeWork.Patterns.FactoryMethod;

public class Americano implements Drink{
    public String Coffe = "Coffe";
    public String Water = "Water * 3";

    @Override
    public String toString() {
        return "Drink Amerikano("+
                Coffe+ ", " + Water + ")";
    }
}
