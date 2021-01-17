import Instrument.Piano;
import Instrument.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;
    Saxophone saxophone1;

    @Before
    public void before(){
        saxophone = new Saxophone("Sopranino Sax", "Brass", "Gold", "Sopranino", "provides the highest pitch", 105, 175, 8);
        saxophone1 = new Saxophone("Alto Sax", "Copper", "Silver", "Baritone", "provides a deep a powerful sound", 225, 350, 6);
    }

    @Test
    public void saxophoneHasKeys(){
        assertEquals(8, saxophone.getKeys());
    }

    @Test
    public void saxophoneHasSound() {
        assertEquals("Classic", saxophone.playSound("Classic"));
    }
}
