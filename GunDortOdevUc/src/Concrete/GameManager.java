package Concrete;

import Abstract.GameService;
import Abstract.Logger;
import Entities.Game;

public class GameManager implements GameService {

    @Override
    public void add(Game game, Logger logger) {
        //oyunu veri tabanına ekle
        logger.log(game.getName() + " isimli oyun veri tabanına eklendi.");
    }

    @Override
    public void makeDiscount(Game game, float discount, Logger logger) {
        game.setDiscount(discount);
        logger.log(game.getName() + " isimli oyunda %" + game.getDiscount() + " indirim uygulandı.");
    }
}
