package EX_OOP.ex9_parkingapp;

public class ParkingLot {

    ParkingSpot[] spots;



    public ParkingLot(int size) {
        this.spots = new ParkingSpot[size];

    }

    public void park(Car car) throws Exception{
        for (int i = 0; i < spots.length; i++) {
            if (!spots[i].isOccupied()){
                //parchez masina la spots[i]
                spots[i].park(car);
                return;
            }
        }
        System.out.println("parking is full");
    }
}
