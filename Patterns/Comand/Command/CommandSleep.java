package Command;

public class CommandSleep implements Command{
    PC pc;

    public CommandSleep(PC pc) {
        this.pc = pc;
    }


    public void execute() {
        pc.PCsleep();
    }
}
