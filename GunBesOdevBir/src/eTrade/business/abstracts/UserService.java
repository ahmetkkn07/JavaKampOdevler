package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

import java.util.List;

public interface UserService {
    boolean add(User user);

    List<User> getAll();

    boolean verificate(User user);

    User getUserBymail(String email);
}
