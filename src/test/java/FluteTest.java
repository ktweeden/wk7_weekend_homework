import Instruments.Flute;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("Yamaha", 100, 125);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(100, flute.getWholesalePrice());
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(125, flute.getSalePrice());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.WIND, flute.getInstrumentType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(25, flute.calculateMarkup());
    }

    @Test
    public void canPlay() {
        assertEquals("Toot toot", flute.play());
    }


}
