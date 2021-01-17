import Instrument.Guitar;
import Instrument.Piano;
import Instrument.Saxophone;
import MusicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Saxophone saxophone;
    Piano piano;

    @Before
    public void before(){
        shop = new Shop("Max's Music");
        guitar = new Guitar("Fender Stratocaster", "Wire", "Red", "6-String", "Has six strings", 10, 15, 6);
    }

    @Test
    public void addNewGuitar(){
        shop.addItemsToStocks(guitar);
        assertEquals(1, shop.stockCount());
    }
    @Test
    public void removeGuitar() {
        shop.removeItemsFromStocks(guitar);
        assertEquals(0, shop.stockCount());
    }


}
