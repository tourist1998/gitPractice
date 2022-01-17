package Module;

import Driver.ParkingLot;

abstract public  class Admin extends Account {
    User user;
    protected abstract void addFloor(Floor floor, ParkingLot parkingLot);
    protected abstract void removeFloor();
    protected abstract void addEntranceTerminal();
    protected abstract void addExitTerminal();

}
