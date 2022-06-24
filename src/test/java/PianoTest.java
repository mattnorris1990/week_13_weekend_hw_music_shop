import instruments.InstrumentType;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(800.0, 1500.0, InstrumentType.KEYBOARD, "mahogany", "black", 88);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(800.0, piano.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1500.0, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("mahogany", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }


    @Test
    public void hasKeysNumber(){
        assertEquals(88, piano.getKeysNumber());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(700.0, piano.calculateMarkup(piano.getSellingPrice(), piano.getBuyingPrice()), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("dingle dingle dang", piano.play());
    }

}
