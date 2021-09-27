import org.junit.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CatTest {
    Cat toby;

    @Before
    public void setUp() {
        toby = new Cat(9.8, 150);
    }

    @Test (timeout = 50)
    public void testGetRating(){
        assertEquals(9.8, toby.getRating());
    }

    @Test (timeout = 50)
    public void testGetPrice(){
        assertEquals(150, toby.getPrice());
    }

    @Test (timeout = 50)
    public void testSound(){
        assertEquals("Meow", toby.sound());
    }

}
