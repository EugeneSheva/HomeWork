package Command;

public class CommandOn implements Command {
    PC pc;

    public CommandOn(PC pc) {
        this.pc = pc;
    }

    @Override
    public void execute() {
    pc.PCon();
    }
}
