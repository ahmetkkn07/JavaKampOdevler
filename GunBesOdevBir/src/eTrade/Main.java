package eTrade;

import eTrade.business.concretes.LoginManager;
import eTrade.business.concretes.RegisterManager;
import eTrade.business.concretes.UserManager;
import eTrade.core.concretes.EmailManager;
import eTrade.core.concretes.EmailVerificationManager;
import eTrade.core.concretes.GmailRegisterAdapter;
import eTrade.dataAccess.concretes.HibernateUserDal;
import eTrade.entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Engin", "DEMİROĞ", "engindemirog@gmil.com", "123");
        RegisterManager registerManager = new RegisterManager(new UserManager(new EmailVerificationManager(new EmailManager()), new HibernateUserDal()), new GmailRegisterAdapter());
        registerManager.register(user1);
        user1.setPassword("123456");
        registerManager.register(user1);

        LoginManager loginManager = new LoginManager(new UserManager(new EmailVerificationManager(new EmailManager()), new HibernateUserDal()));
        loginManager.login(user1.getEmail(), user1.getPassword());

         registerManager.registerUsingGmail("ahmetkkn07@gmail.com");

    }
}
