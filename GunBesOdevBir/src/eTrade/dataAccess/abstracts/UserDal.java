package eTrade.dataAccess.abstracts;

import eTrade.entities.concretes.User;

import java.util.List;

public interface UserDal {
    void add(User user);

    void delete(User user);

    void update(User user);

    User get(int id);

    List<User> getAll();


}
