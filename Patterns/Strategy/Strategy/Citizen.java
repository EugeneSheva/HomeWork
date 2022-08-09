package Strategy;

public class Citizen {
    Activity activity;

    public Citizen(Activity activity) {
        this.activity = activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doIt() {
        activity.doing();
    }
}
