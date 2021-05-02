package Abstract;

import Entities.Player;

public interface UserCheckService {
    boolean checkUser(Player player, Logger logger);
}
