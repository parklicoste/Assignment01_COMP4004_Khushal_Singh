package project;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TileTest {

    @Test
    public void testTile() {
//      Red is Hearts, Black is Spades, Green is Clubs and Orange is Diamonds.
        Tile t = new Tile();

        Assert.assertEquals(false, t.isOccupiedByPlayer());
        Assert.assertEquals("", t.getSuite());
        Assert.assertEquals(0, t.getvalue());
        Assert.assertEquals(0, t.getRank());
    }

    @Test
    public void testTileRank() {
//      Red is Hearts, Black is Spades, Green is Clubs and Orange is Diamonds.
        Tile t = new Tile("R",1, 1, false);

        Assert.assertEquals(false, t.isOccupiedByPlayer());
        Assert.assertEquals("R", t.getSuite());
        Assert.assertEquals(1, t.getvalue());
        Assert.assertEquals(0, t.getRank());
    }




}
