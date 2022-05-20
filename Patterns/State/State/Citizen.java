package State;

public class Citizen {
    Activity activity;

    public Citizen(Activity activity) {
        this.activity = activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleep) {
            setActivity(new Run());
        } else if (activity instanceof  Run) {
            setActivity(new Work());
        } else if (activity instanceof Work) {
            setActivity(new Learn());
        } else if (activity instanceof Learn) {
            setActivity(new Sleep());
        }
    }
    public void doIt() {
        activity.doing();
    }
}
