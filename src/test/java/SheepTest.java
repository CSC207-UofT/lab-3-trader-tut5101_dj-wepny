import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheepTest {
    Sheep s;

    @Before
    public void setUp() throws Exception {
        s = new Sheep();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Mehhhhh!", s.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(17, s.getPrice());
    }

}
