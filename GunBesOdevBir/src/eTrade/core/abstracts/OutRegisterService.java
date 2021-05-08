package eTrade.core.abstracts;

import eTrade.entities.concretes.User;

import java.util.List;

public interface OutRegisterService{
    User register(String email);
}
