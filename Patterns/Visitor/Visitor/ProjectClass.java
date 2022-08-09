package Visitor;

public class ProjectClass implements ProjectInt{
    @Override
    public void wasWritten(Developer developer) {
        developer.write(this);
    }
}
