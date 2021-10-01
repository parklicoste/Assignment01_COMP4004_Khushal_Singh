package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class PlayerTest {

    Player p1 = new Player();

    @Test
    public void testPlayer() {
        Assert.assertEquals("", p1.getName());
    }

    @Test
    public void testHandOfPlayer() {
        Assert.assertEquals(Collections.emptyList(), p1.getPlayer_hand());
    }

    Player p2 = new Player("Khushal");
    @Test
    public void testNameOfPlayer() {
        Assert.assertEquals("Khushal", p2.getName());
    }

    @Test
    public void testNoOfTiles() {
        Assert.assertEquals(0, p2.getCapacity());
    }

}
