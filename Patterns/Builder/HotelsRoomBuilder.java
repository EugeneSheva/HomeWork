package HomeWork.Patterns.patеernBuilder;

public class HotelsRoomBuilder implements Builder {
    private NumberOfSeats numberOfSeats;
    private ViewFromTheWindow vievFromTheWindow;
    private Condition condition;
    private Fridge fridge;

    @Override
    public void setNumberOfSeats(NumberOfSeats numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void setViewFromTheWindow(ViewFromTheWindow viewFromTheWindow) {
    this.vievFromTheWindow = viewFromTheWindow;
    }

    @Override
    public void setCondition(Condition condition) {
    this.condition = condition;
    }

    @Override
    public void setFridge(Fridge fridge) {
    this.fridge = fridge;
    }

    public HotelsRoom getResult (){
        return new HotelsRoom(this.numberOfSeats,this.vievFromTheWindow,this.condition,this.fridge);
    }
}
