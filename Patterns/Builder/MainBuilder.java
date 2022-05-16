public class MainBuilder {
    public static void main(String[] args) {
        HotelsRoomBuilder hotelsRoomBuilder = new HotelsRoomBuilder();
        Director director = new Director();
        ManualHottelsRoomBuilder manualHottelsRoomBuilder = new ManualHottelsRoomBuilder();

        director.PresidentalNumber(hotelsRoomBuilder);
        HotelsRoom presidentalRoom = hotelsRoomBuilder.getResult();
        System.out.println("Your room is Presidental Number "+ presidentalRoom);

        director.LuxNumber(hotelsRoomBuilder);
        HotelsRoom luxNumber = hotelsRoomBuilder.getResult();
        System.out.println("Your room is LuxNumber "+ luxNumber);

        director.StandartNumber(hotelsRoomBuilder);
        HotelsRoom standartNumber = hotelsRoomBuilder.getResult();
        System.out.println("Your room is StandartNumber "+ standartNumber);

        director.EconomRoom(hotelsRoomBuilder);
        HotelsRoom economRoom = hotelsRoomBuilder.getResult();
        System.out.println("Your room is EconomRoom "+ economRoom);

        director.EconomRoomSingle(hotelsRoomBuilder);
        HotelsRoom economRoomSingle = hotelsRoomBuilder.getResult();
        System.out.println("Your room is EconomRoomSingle "+ economRoom);

        director.LuxNumber(manualHottelsRoomBuilder);
        manualHottelsRoomBuilder.setNumberOfSeats(NumberOfSeats.SingleRoom);
        HotelsRoom manualRoom = manualHottelsRoomBuilder.getResult();
        System.out.println("Your room is ManualRoom "+ manualRoom);




    }
}
