package Fasade;

public class KitchenMD implements MoveDetector {
    boolean isOn;

    @Override
    public void on() {
        isOn = true;
        System.out.println("Kitchen motion detector is ON ");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("Kitchen motion detector is OFF ");

    }

    @Override
    public boolean getStatus() {
        return isOn;
    }
}
