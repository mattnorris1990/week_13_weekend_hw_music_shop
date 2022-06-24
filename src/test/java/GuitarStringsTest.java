import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(3.0, 10.0, "Elixer", 11.0);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(3.0, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10.0, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBrand(){
        assertEquals("Elixer", guitarStrings.getBrand());
    }

    @Test
    public void hasGauge(){
        assertEquals(11.0, guitarStrings.getGauge(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(7.0, guitarStrings.calculateMarkup(guitarStrings.getSellingPrice(), guitarStrings.getBuyingPrice()), 0.0);
    }
}
