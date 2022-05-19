package Proxy;

public class ProxyProject implements Project{
    String URL;
    RealProject realProject;

    public ProxyProject(String URL) {
        this.URL = URL;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(URL);
            System.out.println("Create new Project");
        }
        realProject.run();
    }
}
