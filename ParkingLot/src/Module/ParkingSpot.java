package Module;

public abstract class ParkingSpot {
    private String Id;
    private boolean isEmpty;
    private Block block;
    private Vehicle vehicle;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void fillParkingSpot() {

    }
}
