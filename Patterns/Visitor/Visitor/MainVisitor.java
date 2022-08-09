package Visitor;

public class MainVisitor {
    public static void main(String[] args) {
        Project project = new Project();

        JuniorDev juniorDev = new JuniorDev();
        SeniorDev seniorDev = new SeniorDev();

        project.wasWritten(juniorDev);
        System.out.println("=========================");
        project.wasWritten(seniorDev);
    }
}
