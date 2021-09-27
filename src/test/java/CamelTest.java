import org.junit.*;

import static org.junit.Assert.*;

public class CamelTest {
    Camel2 cfancy;
    Camel2 ccheap;

    @Before
    public void setUp() throws Exception {
        cfancy = new Camel2("expensive");
        ccheap = new Camel2("cheap");
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
