package eTrade.business.concretes;

import eTrade.business.abstracts.UserService;
import eTrade.core.abstracts.VerificationService;
import eTrade.dataAccess.abstracts.UserDal;
import eTrade.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private VerificationService verificationService;
    private UserDal userDal;

    public UserManager(VerificationService verificationService, UserDal userDal) {
        this.verificationService = verificationService;
        this.userDal = userDal;
    }

    @Override
    public boolean add(User user) {
        if (user.getPassword().length() < 6) {
            System.out.println("Kullanıcı parolası 6 karakterden uzun olmalıdır!");
            return false;
        }

        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());

        if (!matcher.matches()) {
            System.out.println("Geçersiz email formatı :" + user.getEmail());
            return false;
        }

        List<User> users = userDal.getAll();
        for (User usr : users) {
            if (user.getEmail().equals(usr.getEmail())) {
                System.out.println("Email daha önceden kayıtlı: " + user.getEmail());
                return false;
            }
        }

        if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır!");
            return false;
        }

        if (!verificate(user)) {
            System.out.println("Kullanıcı doğrulanamadı!");
        }
        userDal.add(user);
        System.out.println("Kullanıcı doğrulandı ve eklendi: " + user.getFirstName());
        return true;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean verificate(User user) {
        return verificationService.verificate(user);
    }

    @Override
    public User getUserBymail(String email) {
        List<User> users = userDal.getAll();
        User user = new User();
        for (User usr : users) {
            if (usr.getEmail().equals(email)) {
                user = usr;
            }
        }
        //demo
        user.setEmail("engindemirog@gmail.com");
        user.setPassword("123456");

        return user;
    }
}
