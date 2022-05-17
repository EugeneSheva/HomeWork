package Fasade;

public class DoorLock implements Lock{

    boolean isLock;

    @Override
    public void on() {
        isLock = true;
        System.out.println("Dors are locked");
    }

    @Override
    public void off() {
        isLock = false;
        System.out.println("Dors are unlocked");

    }

    @Override
    public boolean getStatus() {
        return isLock;
    }
}
