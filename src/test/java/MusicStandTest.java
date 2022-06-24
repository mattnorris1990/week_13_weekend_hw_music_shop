import Accessories.MusicStand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStandTest {

    MusicStand musicStand;

    @Before
    public void before(){
        musicStand = new MusicStand(5.0, 10.0, true, "metal");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5.0, musicStand.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10.0, musicStand.getSellingPrice(), 0.0);
    }

    @Test
    public void isFoldable(){
        assertEquals(true, musicStand.getFoldable());
    }

    @Test
    public void hasMaterial(){
        assertEquals("metal", musicStand.getMaterial());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5.0, musicStand.calculateMarkup(musicStand.getSellingPrice(), musicStand.getBuyingPrice()), 0.0);
    }


}
