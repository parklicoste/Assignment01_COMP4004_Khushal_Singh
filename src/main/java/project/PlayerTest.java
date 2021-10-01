package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class PlayerTest {

    @Test
    public void testPlayer() {
        Player p1 = new Player();
        Assert.assertEquals("Bob", p1.getName());
    }

    @Test
    public void testHandOfPlayer() {
        Player p1 = new Player();
        Assert.assertEquals(Collections.emptyList(), p1.getPlayer_hand());
    }



}
