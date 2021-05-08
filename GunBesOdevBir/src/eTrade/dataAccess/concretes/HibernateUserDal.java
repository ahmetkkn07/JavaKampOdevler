package eTrade.dataAccess.concretes;

import eTrade.dataAccess.abstracts.UserDal;
import eTrade.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDal implements UserDal {
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı veri tabanına eklendi: " + user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı veri tabanından silindi: " + user.getFirstName());
    }

    @Override
    public void update(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>();
    }
}
