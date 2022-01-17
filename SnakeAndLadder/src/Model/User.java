package Model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String mobile_no;
    private String Address;

    public User(UUID id, String name, String mobile_no, String address) {
        this.id = id;
        this.name = name;
        this.mobile_no = mobile_no;
        Address = address;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public String getAddress() {
        return Address;
    }
}
