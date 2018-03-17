package Shop;
import Behaviours.ISell;
import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private String name;
    private int till;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getTill() {
        return till;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public ISell findStockByModel(String model) {
        ISell toSell = null;
        for (ISell item : this.stock) {
            if (item.getModel().equals(model)) {
                toSell = item;
            }
        }
        return toSell;
    }

    public void sellItem(String model) {
        ISell toSell = findStockByModel(model);
        this.till += toSell.getSalePrice();
        this.stock.remove(toSell);
    }

    public int calculateTotalProfit() {
        int total = 0;
        for (ISell item : this.stock) {
            total += item.calculateMarkup();
        }
        return total;
    }

}
