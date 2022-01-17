package Module;

import java.sql.Timestamp;

public class Ticket {
    private Integer TicketId;
    private User user;
    private Terminal terminal;
    private Timestamp EntryTimestamp;
    private VehicleType vehicleType;
    void setTicketId(Integer TicketId) {
        this.TicketId = TicketId;
    }
    void setUser(User user) {
        this.user = user;
    }
    void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }
    void setEntryTimestamp() {
        this.EntryTimestamp = new Timestamp(System.currentTimeMillis());
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getTicketId() {
        return TicketId;
    }

    public User getUser() {
        return user;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public Timestamp getEntryTimestamp() {
        return EntryTimestamp;
    }
}
