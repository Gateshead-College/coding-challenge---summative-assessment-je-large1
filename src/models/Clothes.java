package models;

import java.util.ArrayList;

public class Clothes {
    public String item;
    public int id;
    public int price;
    public int quantity;
    public int productName;

    private ArrayList<Clothes> clothesArrayList;
    private Clothes clothes;

    public Clothes(String item, int id, int price, int quantity) {
        this.item = item;
        this.id = id;
        this.price = price;
        this.quantity = quantity;

    }



    public String getItem() {
        return item;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public ArrayList<Clothes> getClothesArrayList() {
        return clothesArrayList;
    }

    public Clothes getClothes() {
        return clothes;
    }
}

