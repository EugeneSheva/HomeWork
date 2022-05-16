public class MetalPlastFactory implements Factory{


    @Override
    public Window createWindow() {
        return new MetalPlastWindow();
    }

    @Override
    public Door createDoor() {
        return new MetalPlastDoor();
    }
}
