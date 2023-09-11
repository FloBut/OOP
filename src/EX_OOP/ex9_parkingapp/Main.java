package EX_OOP.ex9_parkingapp;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(20);
        Car car = new Car("wmp", "blue");
        try {
            parkingLot.park(car);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
