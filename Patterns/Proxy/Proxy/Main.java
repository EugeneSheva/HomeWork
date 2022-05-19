package Proxy;

public class Main {
    public static void main(String[] args) {
        Project project1 = new RealProject("http//:www.gdisc.com/user123/project123");
        project1.run();

        Project project2 = new ProxyProject("http//:www.gdisc.com/user123/project123");
        project2.run();



    }
}
