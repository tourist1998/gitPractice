package Driver;

import Module.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {
    private String Name;
    private Address address;
    private Integer maxVehicleCount;

    private ParkingLot parkingLot = null;
    public ParkingLot getParkingLotInstance() {
        if(parkingLot ==  null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }
    List<Floor> floors = new ArrayList<Floor>();

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(Floor floor) {
        this.floors.add(floor);
    }
}

/*
        Parking Lot
            - Floor
                - Block
                    - Screen
                    - Parking Slot
             - Entry
             - Exit

 */
