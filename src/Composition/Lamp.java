package Composition;

public class Lamp {
    private String Name;
    private boolean battery;
    private boolean on;

    public Lamp(String name, boolean battery, boolean on) {
        Name = name;
        this.battery = battery;
        this.on = on;
    }
    public void turnOn() {
        System.out.println("Lamp -> Turning on");
        this.on = true;
    }
    public void turnOff() {
        System.out.println("Lamp -> Turning Off");
        this.on = false;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
