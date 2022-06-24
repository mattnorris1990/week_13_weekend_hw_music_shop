import Accessories.GuitarStrings;
import Accessories.MusicStand;
import Accessories.SheetMusic;
import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Trumpet trumpet;
    Piano piano;

    GuitarStrings guitarStrings;
    MusicStand musicStand;
    SheetMusic sheetMusic;

    ArrayList<ISell> stockList;

    Shop shop;

    @Before
    public void before() {
        guitar = new Guitar(100.0, 200.0, InstrumentType.STRING, "basswood", "sunburst", 6, true);
        piano = new Piano(800.0, 1500.0, InstrumentType.KEYBOARD, "mahogany", "black", 88);
        trumpet = new Trumpet(350.0, 700.0, InstrumentType.BRASS, "brass", "gold", 3);

        guitarStrings = new GuitarStrings(3.0, 10.0, "Elixer", 11.0);
        musicStand = new MusicStand(5.0, 10.0, true, "metal");
        sheetMusic = new SheetMusic(5.0, 20.0, "Carmen Suite", "Bizet");

        stockList = new ArrayList<>();

        stockList.add(guitar);
        stockList.add(trumpet);
        stockList.add(musicStand);

        shop = new Shop(stockList);

    }

    @Test
    public void hasStockList(){
        assertEquals(3, shop.getStockList().size());
    }

    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(piano);
        assertEquals(4, shop.getStockList().size());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItemToStock(piano);
        assertEquals(4, shop.getStockList().size());
        shop.removeItemFromStock(piano);
        assertEquals(3, shop.getStockList().size());
        shop.removeItemFromStock(musicStand);
        assertEquals(2, shop.getStockList().size());
    }

}
