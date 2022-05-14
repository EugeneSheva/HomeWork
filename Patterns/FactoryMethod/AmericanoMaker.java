package HomeWork.Patterns.FactoryMethod;

public class AmericanoMaker extends DrinkMaker{

    @Override
    public Drink drinkMaking() {
        return new Americano();
    }
}
