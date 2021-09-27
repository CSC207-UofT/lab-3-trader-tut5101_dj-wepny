import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MotorcycleTest {
    Motorcycle motorcycle;

    @Before
    public void setUp() throws Exception {
        motorcycle = new Motorcycle();
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, motorcycle.getPrice());}

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, motorcycle.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        motorcycle.upgradeSpeed();
        assertEquals(125, motorcycle.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        motorcycle.downgradeSpeed();
        assertEquals(75, motorcycle.getMaxSpeed());
    }
}

