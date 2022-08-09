package Visitor;

public interface Developer {
    public void write(ProjectClass projectClass);
    public void write(DataBase dataBase);
    public void write(Test test);
}
