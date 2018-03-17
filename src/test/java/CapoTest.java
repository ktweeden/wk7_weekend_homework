import Acessories.Capo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CapoTest {
    Capo capo;

    @Before
    public void before() {
        capo = new Capo("Plastic", "Medium", "Lookka", 5, 10);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Plastic", capo.getMaterial());
    }

    @Test
    public void hasSize() {
        assertEquals("Medium", capo.getSize());
    }

    @Test
    public void hasMake() {
        assertEquals("Lookka", capo.getModel());
    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(5, capo.getWholesalePrice());
    }
    @Test
    public void hasSalePrice() {
        assertEquals(10, capo.getSalePrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5, capo.calculateMarkup());
    }

}
