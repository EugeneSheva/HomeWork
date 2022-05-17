package Fasade;

public class FasadeSecurity {
    DoorLock doorLock = new DoorLock();
    WindowsLock windowsLock = new WindowsLock();
    HallMD hallMD = new HallMD();
    KitchenMD kitchenMD = new KitchenMD();
    RoomMD roomMD = new RoomMD();


    void on() {
        doorLock.on();
        windowsLock.on();
        hallMD.on();
        kitchenMD.on();
        roomMD.on();
        System.out.println();
    }

    void off() {
        doorLock.off();
        windowsLock.off();
        hallMD.off();
        kitchenMD.off();
        roomMD.off();
        System.out.println();
    }
    void getStatus(){
        System.out.println("Is doors locked: " + doorLock.getStatus());
        System.out.println("Is windows locked: " + windowsLock.getStatus());
        System.out.println("Is hall motion detector: " + hallMD.getStatus());
        System.out.println("Is kitchen motion detector: " + kitchenMD.getStatus());
        System.out.println("Is room motion detector: " + roomMD.getStatus());
        System.out.println();
    }
}
