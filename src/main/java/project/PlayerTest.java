package project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayerTest {

    @Test
    public void testPlayer() {
        Player p1 = new Player();
        Assert.assertEquals("Bob", p1.getName());
    }



}
