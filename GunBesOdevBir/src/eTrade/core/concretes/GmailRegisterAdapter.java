package eTrade.core.concretes;

import eTrade.core.abstracts.OutRegisterService;
import eTrade.entities.concretes.User;
import eTrade.gmail.GmailRegister;

import java.util.List;

public class GmailRegisterAdapter implements OutRegisterService {
    @Override
    public User register(String email) {
        GmailRegister gmailRegister = new GmailRegister();
        List<String> userData = gmailRegister.getUserData(email);

        User user = new User();
        user.setId(15);
        user.setFirstName(userData.get(0));
        user.setLastName(userData.get(1));
        user.setEmail(userData.get(2));
        user.setPassword(userData.get(3));
        return user;
    }
}
