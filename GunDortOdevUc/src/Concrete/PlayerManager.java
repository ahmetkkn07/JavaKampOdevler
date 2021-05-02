package Concrete;

import Abstract.Logger;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {
    @Override
    public void add(Player player, Logger logger) throws Exception {
        UserCheckManager userCheckManager = new UserCheckManager();
        if (userCheckManager.checkUser(player, new DatabaseLogger())) {
            logger.log(player.getFirstName() + " isimli oyuncu veri tabanına eklendi.");
        } else {
            throw new Exception("Invalid user");
        }
    }
}
