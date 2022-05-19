package Memento;

import java.util.Date;

public class Project {
    String version;
    Date date;

    public void ProjectSetVers(String version) {
        this.version = version;
        this.date = new Date();
    }


    public Save save() {
        return new Save(version);
    }
    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Prodjeect " + "version: " + version +
                "\ndate: " + date + "\n";
    }
}
