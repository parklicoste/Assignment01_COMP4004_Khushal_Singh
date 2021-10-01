package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HandTest {

    Hand h = new Hand();

    @Test
    public void testHand() {
        Assert.assertEquals(Collections.emptyList(), h.getHand()); // check for deck
    }

    @Test
    public void testInsertTileInHand() {
        Tile t1 = new Tile("R", 1, 1, true);
        Tile t2 = new Tile("B", 11, 10, true);
        Tile t3 = new Tile("G", 13, 10, true);
        Tile t4 = new Tile("0", 12, 10, true);

        h.insert(t1);
        h.insert(t2);
        h.insert(t3);
        h.insert(t4);

        Assert.assertEquals(4, h.getHand().size()); // check for 4 tiles in hand
    }
}
