package Proxy;

class RealProject implements Project{
    String URL;

    public RealProject(String URL) {
        this.URL = URL;
        load();
    }

    void load(){
        System.out.println("Loading project " + URL + ".");
    }

    @Override
    public void run() {
        System.out.println("Running project " + URL + " .");
    }
}
