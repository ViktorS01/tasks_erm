package practice.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements Mediator{

    Admin admin;
    List<Userr> users = new ArrayList<>();

    public void sendMessage(String message) {
        for (Userr x: users){
            x.getMessage(message);
        }

        admin.getMessage(message);
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUsers(Userr...user) {
        for (Userr x: user){
            users.add(x);
        }
    }
}
