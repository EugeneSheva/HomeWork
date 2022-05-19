package Command;

public class CommandOff implements Command{
    PC pc;

    public CommandOff(PC pc) {
        this.pc = pc;
    }
    @Override
    public void execute() {
        pc.PCoff();
    }
}
