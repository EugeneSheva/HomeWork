package Visitor;

public class JuniorDev implements Developer{


    @Override
    public void write(ProjectClass projectClass) {
        System.out.println("Write dad code.");
    }

    @Override
    public void write(DataBase dataBase) {
        System.out.println("Drop database.");
    }

    @Override
    public void write(Test test) {
        System.out.println("Creating dad test.");

    }
}
