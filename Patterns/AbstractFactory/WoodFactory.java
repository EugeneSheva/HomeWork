package HomeWork.Patterns.AbstractFactory;

public class WoodFactory implements Factory {
    @Override
    public Window createWindow() {
        return new WoodWindow();
    }

    @Override
    public Door createDoor() {
        return new WoodDoor();
    }
}
