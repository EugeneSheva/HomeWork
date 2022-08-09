package Visitor;

public class Test implements ProjectInt{
    @Override
    public void wasWritten(Developer developer) {
        developer.write(this);
    }
}
