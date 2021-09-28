package project;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TileTest {

    @Test
    public void testTile() {
//        Red is Hearts, Black is Spades, Green is Clubs and Orange is Diamonds.
        Tile t = new Tile("R",1, false);

        Assert.assertEquals(true, t.isOccupiedByPlayer());
        Assert.assertEquals("R", t.getSuite());
        Assert.assertEquals(1, t.getvalue());
    }




}