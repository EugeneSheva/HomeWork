package Visitor;

public class Project implements ProjectInt{
    ProjectInt[]projectList;

    public Project() {
        this.projectList = new ProjectInt[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void wasWritten(Developer developer) {
        for (ProjectInt p : projectList) {
            p.wasWritten(developer);
        }
    }
}
