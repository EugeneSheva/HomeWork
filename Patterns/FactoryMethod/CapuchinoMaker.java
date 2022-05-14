package HomeWork.Patterns.FactoryMethod;

public class CapuchinoMaker extends DrinkMaker {

    @Override
    public Drink drinkMaking() {
        return new Capuchino();
    }
}
