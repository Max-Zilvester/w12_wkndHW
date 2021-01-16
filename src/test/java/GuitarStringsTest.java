import Accessories.DrumSticks;
import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;
    GuitarStrings guitarStrings1;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Acoustic String", "produce sound without intervention", 11.5, 15.5, 2);
        guitarStrings1 = new GuitarStrings("Steel String", "prevent corrosion from sweat", 14, 17, 4);
    }

    @Test
    public void guitarStringsHasFret(){
        assertEquals(2, guitarStrings.getFrets());
    }
}
