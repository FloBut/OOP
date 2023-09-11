package Composition;

public class BedRoom {
    private String name;
    private Wall[] walls;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public BedRoom(String name, Wall[] walls, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.walls = walls;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public Lamp getLamp() {
        return this.lamp;
    }
    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
