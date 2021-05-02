package Entities;

import Abstract.Entity;

public class Game implements Entity {
    private int id;
    private String name;
    private float price;
    private float discount;
    private float priceAfterDiscount;

    public Game(int id, String name, float price, float discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.priceAfterDiscount = price - price * (discount / 100);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {

        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
        this.priceAfterDiscount = this.price - this.price * (this.discount / 100);
    }

    public float getPriceAfterDiscount() {
        this.priceAfterDiscount = this.price - this.price * (this.discount / 100);
        return priceAfterDiscount;
    }

    public void setPriceAfterDiscount(float priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }
}
