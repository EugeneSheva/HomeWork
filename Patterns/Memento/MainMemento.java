

public class MainMemento {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        Repositary repositary = new Repositary();

        project.ProjectSetVers("1.0");
        System.out.println(project);

        repositary.setSave(project.save());
        Thread.sleep(2000);

        project.ProjectSetVers("2.0");
        System.out.println(project);
        System.out.println("zsgb45e54yxd");

        project.load(repositary.getSave());
        System.out.println(project);




    }
}
