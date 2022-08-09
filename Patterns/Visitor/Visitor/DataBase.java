package Visitor;

public class DataBase implements ProjectInt{
    @Override
    public void wasWritten(Developer developer) {
        developer.write(this);
    }
}
