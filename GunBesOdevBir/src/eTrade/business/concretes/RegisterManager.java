package eTrade.business.concretes;

import eTrade.business.abstracts.RegisterService;
import eTrade.business.abstracts.UserService;
import eTrade.core.abstracts.OutRegisterService;
import eTrade.entities.concretes.User;

public class RegisterManager implements RegisterService {
    private UserService userService;
    private OutRegisterService outRegisterService;

    public RegisterManager(UserService userService, OutRegisterService outRegisterService) {
        this.userService = userService;
        this.outRegisterService = outRegisterService;
    }

    @Override
    public boolean register(User user) {
        return userService.add(user);
    }

    @Override
    public boolean registerUsingGmail(String email) {
        return register(outRegisterService.register(email));
    }
}
