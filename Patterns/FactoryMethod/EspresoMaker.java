package HomeWork.Patterns.FactoryMethod;

public class EspresoMaker extends DrinkMaker{

    @Override
    public Drink drinkMaking() {
        return new Espreso();
    }
}
