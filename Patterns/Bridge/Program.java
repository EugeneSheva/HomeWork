public abstract class Program {
    Dev developer;

    protected Program(Dev developer) {
        this.developer = developer;
    }
    public abstract void MakeProgram();
}
