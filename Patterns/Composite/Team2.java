import java.util.ArrayList;
import java.util.List;

public class Team2 {
    private List<Dev> devList = new ArrayList<>();

        public void addDev(Dev dev) {
            devList.add(dev);
        }
        public void delDev(Dev dev) {
            devList.remove(dev);
        }
        public void createProject() {
            System.out.println("Team2 creating project...");
            for(Dev dev: devList) {
                dev.WriteCode();
            }
        }
    }


