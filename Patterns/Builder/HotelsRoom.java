public class HotelsRoom {
    private NumberOfSeats numberOfSeats;
    private ViewFromTheWindow vievFromTheWindow;
    private Condition condition;
    private Fridge fridge;

    public HotelsRoom(NumberOfSeats numberOfSeats, ViewFromTheWindow vievFromTheWindow, Condition condition, Fridge fridge) {
        this.numberOfSeats = numberOfSeats;
        this.vievFromTheWindow = vievFromTheWindow;
        this.condition = condition;
        this.fridge = fridge;
    }

    public NumberOfSeats getNumberOfSeats() {
        return numberOfSeats;
    }

    public ViewFromTheWindow getVievFromTheWindow() {
        return vievFromTheWindow;
    }

    public Condition getCondition() {
        return condition;
    }

    public Fridge getFridge() {
        return fridge;
    }

    @Override
    public String toString() {
        return "Room("+
                "NumberOfSeats - " + numberOfSeats + ", " +
                "ViewFromTheWindow - " + vievFromTheWindow + ", " +
                "Condition - " + condition + ", " +
                "Fridge - " + fridge + ")";
    }
}
enum NumberOfSeats {
    SingleRoom, DoubleRoom, TripleRoom, QuadrupleRoom;
}
enum ViewFromTheWindow {
    SeaView, CourtyardView
}
enum Condition {
    Conditionear, Fan
}
enum Fridge {
    Fridge, NoFridge
}


