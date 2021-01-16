
import Accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumsticks;
    DrumSticks drumsticks1;

    @Before
    public void before(){
        drumsticks = new DrumSticks("Cane", "5A – standard drumstick", 10.5, 12.5, "Wood");
        drumsticks1 = new DrumSticks("Baton", "7A – perfect for jazz", 13, 15, "Metal");
    }

    @Test
    public void drumSticksMaterialType(){
        assertEquals("Metal", drumsticks1.getMaterialType());
    }
}
