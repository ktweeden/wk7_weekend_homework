import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Yamaha U1", 100, 200);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(100, piano.getWholesalePrice());
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(200, piano.getSalePrice());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, piano.getInstrumentType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100, piano.calculateMarkup());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink plonk", piano.play());
    }


}
