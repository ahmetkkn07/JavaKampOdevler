package Abstract;

import Entities.Player;

public interface PlayerService {
    void add(Player player, Logger logger) throws Exception;
}
