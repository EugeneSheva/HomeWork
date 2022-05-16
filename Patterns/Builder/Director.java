public class Director {
    public void PresidentalNumber(Builder builder){
        builder.setNumberOfSeats(NumberOfSeats.QuadrupleRoom);
        builder.setViewFromTheWindow(ViewFromTheWindow.SeaView);
        builder.setCondition(Condition.Conditionear);
        builder.setFridge(Fridge.Fridge);
    }
    public void LuxNumber(Builder builder) {
        builder.setNumberOfSeats(NumberOfSeats.TripleRoom);
        builder.setViewFromTheWindow(ViewFromTheWindow.SeaView);
        builder.setCondition(Condition.Conditionear);
        builder.setFridge(Fridge.Fridge);
    }
    public void StandartNumber(Builder builder) {
        builder.setNumberOfSeats(NumberOfSeats.DoubleRoom);
        builder.setViewFromTheWindow(ViewFromTheWindow.CourtyardView);
        builder.setCondition(Condition.Conditionear);
        builder.setFridge(Fridge.NoFridge);
    }
    public void EconomRoom(Builder builder) {
        builder.setNumberOfSeats(NumberOfSeats.DoubleRoom);
        builder.setViewFromTheWindow(ViewFromTheWindow.CourtyardView);
        builder.setCondition(Condition.Fan);
        builder.setFridge(Fridge.NoFridge);
    }
    public void EconomRoomSingle(Builder builder) {
        builder.setNumberOfSeats(NumberOfSeats.SingleRoom);
        builder.setViewFromTheWindow(ViewFromTheWindow.CourtyardView);
        builder.setCondition(Condition.Conditionear);
        builder.setFridge(Fridge.NoFridge);
    }
}
