package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface RegisterService {
    boolean register(User user);

    boolean registerUsingGmail(String email);
}
