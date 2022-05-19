package Command;

public class User {
    Command on;
    Command off;
    Command sleep;
    Command wakeup;

    public User(Command on,Command off, Command sleep, Command wakeup) {
        this.on = on;
        this.off = off;
        this.sleep = sleep;
        this.wakeup = wakeup;
    }

    public void onPC(){
        on.execute();
    }
    public void offPC(){
        off.execute();
    }
    public void sleepPC(){
        sleep.execute();
    }
    public void wakeupPC(){
        wakeup.execute();
    }


}
