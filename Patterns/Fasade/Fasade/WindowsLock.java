package Fasade;

public class WindowsLock implements Lock{

    boolean isLock;

    @Override
    public void on() {
        isLock = true;
        System.out.println("Windows are locked");
    }

    @Override
    public void off() {
        isLock = false;
        System.out.println("Windows are unlocked");

    }

    @Override
    public boolean getStatus() {
        return isLock;
    }
}
