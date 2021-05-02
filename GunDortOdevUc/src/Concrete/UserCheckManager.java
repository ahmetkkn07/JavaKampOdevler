package Concrete;

import Abstract.Logger;
import Abstract.UserCheckService;
import Entities.Player;

public class UserCheckManager implements UserCheckService {

    @Override
    public boolean checkUser(Player player, Logger logger) {
        //e devlet doğrulama
        logger.log(player.getNationalityId() + " T.C. kimlik numaralı kişi için sorgulama yapılmıştır.");
        return true;
    }
}
