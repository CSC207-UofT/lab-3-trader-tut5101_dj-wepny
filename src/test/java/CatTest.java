import org.junit.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CatTest {
    Cat toby;

    @Before
    public void setUp() {
        toby = new Cat(150);
    }

    @Test
    public void testGetPrice(){
        assertEquals(150, toby.getPrice());
    }

    @Test
    public void testSound(){
        assertEquals("Meow", toby.sound());
    }

}
