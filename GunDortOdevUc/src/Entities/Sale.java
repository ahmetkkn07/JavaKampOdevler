package Entities;

import Abstract.Entity;

public class Sale implements Entity {
    private int id;
    private Player player;
    private Game[] games;
    private float totalPrice;

    public Sale(int id, Player player, Game[] games) {
        this.id = id;
        this.player = player;
        this.games = games;
        this.totalPrice = 0;
        for (Game game : games) {
            this.totalPrice += game.getPriceAfterDiscount();
        }

    }

    public int getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }

    public Game[] getGames() {
        return games;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
}
