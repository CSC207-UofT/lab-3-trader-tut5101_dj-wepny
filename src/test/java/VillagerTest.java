/*
 * This file contains sample JUnit test cases for Villager.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class VillagerTest {
    Villager villager;

    @Before
    public void setUp() throws Exception {
        villager = new Villager();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hmmm", villager.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, villager.getPrice());
    }
}
