package HomeWork.Patterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        DrinkMaker americano = new AmericanoMaker();
        System.out.println(americano.drinkMaking());

        DrinkMaker espreso = new EspresoMaker();
        System.out.println(espreso.drinkMaking());

        DrinkMaker capuchino = new CapuchinoMaker();
        System.out.println(capuchino.drinkMaking());

    }
}
