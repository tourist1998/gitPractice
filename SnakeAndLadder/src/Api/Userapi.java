package Api;

import Model.User;

import java.util.List;
import java.util.UUID;

public class Userapi {
    public User addUser(String UserName,String MobileNo,String Address) {
        UUID userid = UUID.randomUUID();
        return new User(userid,UserName,MobileNo,Address);
    }
}
