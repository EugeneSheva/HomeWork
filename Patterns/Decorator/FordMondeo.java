public class FordMondeo extends CarDec{
    String name = "Ford Mondeo ";
    int price = 23_000;

    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
