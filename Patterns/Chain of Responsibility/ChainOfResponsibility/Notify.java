package ChainOfResponsibility;

public abstract class Notify {
    private int priority;
    private Notify nextNotify;

    public Notify(int priority) {
        this.priority = priority;
    }

    public void setNextNotify(Notify nextNotify) {
        this.nextNotify = nextNotify;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void notifyManeger(String message, int level) {
        if (level>=priority) {
            write(message);
        }
        if (nextNotify != null) {
            nextNotify.notifyManeger(message, level);
        }
    }
    public abstract void write(String massege);
}
