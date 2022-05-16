public class Box implements Clonable {
    protected int weight;
    protected int volume;

    public Box(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public Box clone() {
        Box copy = new Box(this.weight, this.volume);
        return copy;
    }

    @Override
    public String toString() {
        return "box ("+"weight - " + weight +", " + "volume - " +volume+").";
    }
}
