package Service;
import Driver.ParkingLot;
import Module.*;

import java.util.List;
import java.util.PriorityQueue;

public class AdminService extends Admin {
    public  void addFloor(Floor floor, ParkingLot parkingLot) {
        parkingLot.getFloors().add(floor);
    }
    public void removeFloor(Floor floor,ParkingLot parkingLot) {
        parkingLot.getFloors().remove(floor);
    }
    public void addEntranceTerminal() {

    }
    public void addExitTerminal() {

    }
}
