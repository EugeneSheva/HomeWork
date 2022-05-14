package HomeWork.Patterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Factory woodFactory = new WoodFactory();
        Factory metalPlastFactory = new MetalPlastFactory();
        woodFactory.createDoor();
        woodFactory.createWindow();
        metalPlastFactory.createDoor();
        metalPlastFactory.createWindow();
    }
}
