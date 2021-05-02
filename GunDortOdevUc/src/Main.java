import Concrete.DatabaseLogger;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class Main {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();
        GameManager gameManager = new GameManager();
        SaleManager saleManager = new SaleManager();

        Player player1 = new Player(1, "Ahmet", "KÖKEN", "11111111111");
        Player player2 = new Player(2, "Engin", "DEMİROĞ", "22222222222");

        try {
            playerManager.add(player1, new DatabaseLogger());
            playerManager.add(player2, new DatabaseLogger());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        Game game1 = new Game(1, "Minecraft", 129.9f, 0);
        Game game2 = new Game(2, "Gta V", 189.9f, 0);

        gameManager.add(game1, new DatabaseLogger());
        gameManager.add(game2, new DatabaseLogger());

        Game[] games = {game1, game2};
        Sale sale1 = new Sale(1, player1, games);
        saleManager.add(sale1, new DatabaseLogger());

        gameManager.makeDiscount(game2, 15, new DatabaseLogger());

        Sale sale2 = new Sale(1, player2, games);
        saleManager.add(sale2, new DatabaseLogger());

    }
}
