package Fasade;

public class RoomMD implements MoveDetector {
    boolean isOn;

    @Override
    public void on() {
        isOn = true;
        System.out.println("Room motion detector is ON ");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("Room motion detector is OFF ");

    }

    @Override
    public boolean getStatus() {
        return isOn;
    }
}
