import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {waterbottle = new WaterBottle(100);}

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void hasDrunk(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void hasEmptied(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void hasRefilled(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
        waterbottle.refill();
        assertEquals(100, waterbottle.getVolume());
    }

}
