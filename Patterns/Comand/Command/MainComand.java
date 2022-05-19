package Command;

public class MainComand {
    public static void main(String[] args) {

        PC pc = new PC();

        User user = new User(
                new CommandOn(pc),
                new CommandOff(pc),
                new CommandSleep(pc),
                new CommandWakeUp(pc)
        );
        user.onPC();
        user.offPC();
        user.sleepPC();
        user.wakeupPC();
    }
}
