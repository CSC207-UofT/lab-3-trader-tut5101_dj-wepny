import org.junit.*;

import static org.junit.Assert.*;

public class CamelTest {
    Camel cfancy;
    Camel ccheap;

    @Before
    public void setUp() throws Exception {
        cfancy = new Camel("expensive");
        ccheap = new Camel("cheap");
    }

    public void TestGetPrice(){
        assertEquals(1000000, cfancy.getPrice());
        assertEquals(100000, ccheap.getPrice());
    }

    public void TestSound(){
        assertEquals("Bleeearrrrr", cfancy.sound());
        assertEquals("Bleeearrrrr", ccheap.sound());
    }
}
