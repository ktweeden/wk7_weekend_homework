package Acessories;

public class Capo extends Accessory {

    private String material;
    private String size;

    public Capo(String material, String size, String make, int wholesalePrice, int salePrice) {
        super(make, wholesalePrice, salePrice);
        this.material = material;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}
