// ✅ Vehicle Class - Represents different vehicle types.
// ✅ ParkingSlot Class - Represents an individual parking slot.
// ✅ ParkingLot Class - Manages multiple levels and parking slots.
// ✅ Methods:

// parkVehicle(Vehicle vehicle) → Assigns a slot to a vehicle.
// removeVehicle(String licensePlate) → Removes a vehicle from a slot.
// getAvailableSlots() → Shows available slots across levels.



import java.util.ArrayList;
import java.util.Scanner;
class Vehicle{
    private String licensePlate;
    private String vehicleType;

    public Vehicle(String licensePlate,String vehicleType){
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }
}

class ParkingSlot{

    private int slotNo;
    private boolean isAvailable;

    public ParkingSlot(int slotNo,boolean isAvailable){
        this.slotNo = slotNo;
        this.isAvailable = isAvailable;
    }
}

class ParkingLot{
    private int floorNo;
    private ArrayList<ParkingSlot> parking;

    public ParkingLot(int floorNo, ArrayList<ParkingSlot> parking){
        this.floorNo = floorNo;
        this.parking = parking;
    }

    public void parkVehicle(Vehicle vehicle){
        
    }

    public void removeVehicle(String licensePlate){

    }

    public void getAvailableSlots(){

    }
} 
public class Parking {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter no of floors: ");
        int floorNos = in.nextInt();
        
        System.out.println("Enter slots in each floor: ");
        int slotNos = in.nextInt();
        
        ArrayList<ParkingSlot> parkingInFloor = new ArrayList<>();
        ArrayList<ParkingLot> totParkingLot = new ArrayList<>();
        for(int i=0;i<floorNos;i++){
            int floorNo = i;
            for (int j=0;j<slotNos;j++){
                int slotNo = j+1;
                boolean isAvailable = true;
                ParkingSlot parkingSlot = new ParkingSlot(slotNo, isAvailable); 
                parkingInFloor.add(parkingSlot);
            }
            ParkingLot parkingLot = new ParkingLot(floorNo, parkingInFloor);
            totParkingLot.add(parkingLot);
        }

        for(ParkingLot i : totParkingLot){
            i.parkVehicle(null);
        }
    }
}
