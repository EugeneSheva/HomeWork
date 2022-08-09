public class MainAdapter {
    public static void main(String[] args) {
        ToyotaCorolla toyotaCorolla = new ToyotaCorolla();
        TV tv = new TV();
        Adapter adapter = new Adapter(toyotaCorolla);
        adapter.TurnOn();
        adapter.TurnOff();

        tv.TurnOn();
        tv.TurnOff();


    }
}
