import Accessories.GuitarStrings;
import Accessories.MusicSheets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetsTest {

    MusicSheets musicSheets;
    MusicSheets musicSheets1;

    @Before
    public void before(){
        musicSheets = new MusicSheets("Lead Sheets", "basic harmonic info", 4, 5.5, 4);
        musicSheets1 = new MusicSheets("Cord Charts", "specifies elements of popular song", 3, 4.5, 3);
    }

    @Test
    public void musicSheetsHasSheets(){
        assertEquals(4, musicSheets.getNumberOfSheets());
    }
}
