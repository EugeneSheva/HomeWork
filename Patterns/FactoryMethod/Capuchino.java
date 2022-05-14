package HomeWork.Patterns.FactoryMethod;

public class Capuchino implements Drink{
    public String Coffe = "Coffe";
    public String Water = "Water";
    public String Milk = "Milk";

    @Override
    public String toString() {
        return "Drink Espreso(" +
                Coffe + ", " + Water + ", " + Milk + ")";
    }
}
