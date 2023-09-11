package Composition;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("est");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("South");
        Wall[] walls = new Wall[]{wall1, wall2, wall3, wall4};

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("pat1", 4, 200, 200);

        Lamp lamp = new Lamp("lamp1", true, false);

        BedRoom bedRoom = new BedRoom("dorm1", walls, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
