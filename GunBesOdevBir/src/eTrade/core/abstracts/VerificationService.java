package eTrade.core.abstracts;

import eTrade.entities.concretes.User;

public interface VerificationService {
    boolean verificate(User user);
}
