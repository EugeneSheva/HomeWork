package Fasade;

public class HallMD implements MoveDetector {
    boolean isOn;

    @Override
    public void on() {
        isOn = true;
        System.out.println("Hall motion detector is ON ");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("Hall motion detector is OFF ");

    }

    @Override
    public boolean getStatus() {
        return isOn;
    }
}
