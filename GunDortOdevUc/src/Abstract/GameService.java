package Abstract;

import Entities.Game;

public interface GameService {
    void add(Game game, Logger logger);

    void makeDiscount(Game game, float discount, Logger logger);
}
