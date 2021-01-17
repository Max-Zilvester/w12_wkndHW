import Instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;
    Piano piano1;

    @Before
    public void before(){
        piano = new Piano("Grand piano", "cast iron", "Burgundy", "Grand", "Large massive piano", 100, 150, 3);
        piano1 = new Piano("Upright pianos", "carbon steel", "Black", "Baby Grand", "smaller grand piano", 220, 250, 3);
    }

    @Test
    public void pianoHasPedals(){
        assertEquals(3, piano.getPedals());
    }


    @Test
    public void pianoHasSound() {
        assertEquals("Chime", piano.playSound("Chime"));
    }
}
