import Instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Guitar guitar1;

    @Before
    public void before(){
        guitar = new Guitar("Fender Stratocaster", "Wire", "Red", "6-String", "Has six strings", 10, 15, 6);
        guitar1 = new Guitar("Electric Guitar", "Alder", "Brown", "12-String", "Has twelve strings", 22, 25, 12);
    }

    @Test
    public void guitarHasName(){
       assertEquals("Fender Stratocaster", guitar.getName());
    }

    @Test
    public void guitarHasRawMaterials(){
        assertEquals("dude", guitar1.getRawMaterials());
    }


}
