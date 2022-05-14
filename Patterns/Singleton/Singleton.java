package HomeWork.Patterns.Singleton;

public class Singleton {
    private static Singleton instance;
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    private Singleton (){}

        public static synchronized Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

    @Override
    public String toString() {
        return "Singleton{" +
                "value=" + value +
                '}';
    }
}
