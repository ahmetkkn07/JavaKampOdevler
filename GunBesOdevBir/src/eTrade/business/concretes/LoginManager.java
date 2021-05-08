package eTrade.business.concretes;

import eTrade.business.abstracts.LoginService;
import eTrade.business.abstracts.UserService;
import eTrade.entities.concretes.User;

public class LoginManager implements LoginService {
    private UserService userService;

    public LoginManager(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean login(String email, String password) {
        User user = userService.getUserBymail(email);
        if (user == null) {
            System.out.println("Hatalı email!");
            return false;
        }
        if (user.getPassword() != password) {
            System.out.println("Hatalı şifre!");
            return false;
        }
        System.out.println("Başarıyla giriş yapıldı");
        return true;
    }
}
