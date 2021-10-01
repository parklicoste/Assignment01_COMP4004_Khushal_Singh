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

    @Test
    public void testInsertingTilesInHand() {
        Tile t1 = new Tile("R", 1, 1, true);
        Tile t2 = new Tile("B", 11, 10, true);
        Tile t3 = new Tile("G", 13, 10, true);
        Tile t4 = new Tile("0", 12, 10, true);

        p2.insertTileInHand(t1);
        p2.insertTileInHand(t2);
        p2.insertTileInHand(t3);
        p2.insertTileInHand(t4);

        Assert.assertEquals(4, p2.getCapacity()); // no of tiles in hand
    }


}
