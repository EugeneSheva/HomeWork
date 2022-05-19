package Command;

public class CommandWakeUp implements Command{
    PC pc;

    public CommandWakeUp(PC pc) {
        this.pc = pc;
    }

    @Override
    public void execute() {
        pc.PCwakeUp();
    }
}
