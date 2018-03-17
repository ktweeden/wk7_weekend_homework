import Instruments.Guitar;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;

    @Before
    public void before() {
        shop = new Shop("Kate's shop");
        guitar = new Guitar("Strat", 100, 175, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Kate's shop", shop.getName());
    }

    @Test
    public void hasStock() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canFindStockByModel() {
        shop.addToStock(guitar);
        assertEquals(guitar, shop.findStockByModel("Strat"));
    }

    @Test
    public void noModelFound() {
        assertEquals(null, shop.findStockByModel("Strat"));
    }

    @Test
    public void hasTill() {
        assertEquals(0, shop.getTill());
    }

    @Test
    public void canSellItem() {
        shop.addToStock(guitar);
        shop.sellItem("Strat");
        assertEquals(175, shop.getTill());
    }

    @Test
    public void canCalculateTotalProfit() {
        shop.addToStock(guitar);
        shop.addToStock(guitar);
        assertEquals(150, shop.calculateTotalProfit());
    }
}
