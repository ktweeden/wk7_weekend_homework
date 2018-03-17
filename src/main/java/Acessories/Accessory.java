package Acessories;

import Behaviours.ISell;

public abstract class Accessory implements ISell{
   private int wholesalePrice;
   private int salePrice;
   private String model;

    public Accessory(String model, int wholesalePrice, int salePrice) {
        this.model = model;
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
    }

    @Override
    public int calculateMarkup() {
        return salePrice - wholesalePrice;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public String getModel() {
        return model;
    }
}
