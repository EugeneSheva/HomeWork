package Visitor;

public class SeniorDev implements Developer{
    @Override
    public void write(ProjectClass projectClass) {
        System.out.println("Rewrite code");
    }

    @Override
    public void write(DataBase dataBase) {
        System.out.println("Fixing database");
    }

    @Override
    public void write(Test test) {
        System.out.println("Create good test");
    }
}
