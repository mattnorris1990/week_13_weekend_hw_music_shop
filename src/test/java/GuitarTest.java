import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(100.0, 200.0, InstrumentType.STRING, "basswood", "sunburst", 6, true);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(100.0, guitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(200.0, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("basswood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("sunburst", guitar.getColour());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getStringsNumber());
    }

    @Test
    public void hasHollowBodyStatus(){
        assertEquals(true, guitar.getHollowBody());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100.0, guitar.calculateMarkup(guitar.getSellingPrice(), guitar.getBuyingPrice()), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("a-woogah woogah", guitar.play());
    }


}
