import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    Cat c;

    @Before
    public void setUp() throws Exception {
        c = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meow", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(2, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, c.getPrice());
    }

}
