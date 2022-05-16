public class MainAbstractFactory {
    public static void main(String[] args) {
        Factory woodFactory = new WoodFactory();
        Factory metalPlastFactory = new MetalPlastFactory();
        woodFactory.createDoor();
        woodFactory.createWindow();
        metalPlastFactory.createDoor();
        metalPlastFactory.createWindow();
    }
}
