import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(350.0, 700.0, InstrumentType.BRASS, "brass", "gold", 3);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(350.0, trumpet.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(700.0, trumpet.getSellingPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", trumpet.getColour());
    }


    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getValves());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(350.0, trumpet.calculateMarkup(trumpet.getSellingPrice(), trumpet.getBuyingPrice()), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot toot", trumpet.play());
    }

}
