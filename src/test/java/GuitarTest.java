import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Strat", 50, 75, 6);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(50, guitar.getWholesalePrice());
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(75, guitar.getSalePrice());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(25, guitar.calculateMarkup());
    }

    @Test
    public void canPlay() {
        assertEquals("Krraaaannnngggg", guitar.play());
    }



}
