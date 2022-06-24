import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(5.0, 20.0, "Carmen Suite", "Bizet");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5.0, sheetMusic.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(20.0, sheetMusic.getSellingPrice(), 0.0);
    }

    @Test
    public void hasTitle() {
        assertEquals("Carmen Suite", sheetMusic.getTitle());
    }

    @Test
    public void hasComposer() {
        assertEquals("Bizet", sheetMusic.getComposer());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(15.0, sheetMusic.calculateMarkup(sheetMusic.getSellingPrice(),sheetMusic.getBuyingPrice()), 0.0);
    }

}
