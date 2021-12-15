package models;

import java.util.ArrayList;

public class Clothes {
    public String item;
    public int id;
    public int price;
    public int quantity;

    private ArrayList<Clothes> clothesArrayList;
    private Clothes clothes;

    public Clothes(String item, int id, int price, int quantity) {
        this.item = item;
        this.id = id;
        this.price = price;
        this.quantity = quantity;

    }
}

