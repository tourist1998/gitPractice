package Module;

import java.util.Vector;

public abstract class Block {
    private VehicleType vehicleType;
    private String Number;
    private Integer length,breadth;
    private DisplayBoard displayBoard;
    private Vector<Vector<ParkingSpot>> parkingSpots;

    Vector<Vector<ParkingSpot>> createBlock(int length,int breadth) {
        return parkingSpots = new Vector<Vector<ParkingSpot>>();
    }

    public Vector<Vector<ParkingSpot>> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(Vector<Vector<ParkingSpot>> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public void setBreadth(Integer breadth) {
        this.breadth = breadth;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Block(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
