public class Espreso implements Drink{
    public String Coffe = "Coffe";
    public String Water = "Water";

    @Override
    public String toString() {
        return "Drink Espreso(" +
                Coffe + ", " + Water + ")";
    }
}
