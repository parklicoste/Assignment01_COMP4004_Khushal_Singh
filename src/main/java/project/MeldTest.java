package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class MeldTest {

    @Test
    public void testMeldGroupAndRun() {
        Meld m = new Meld();
        Assert.assertEquals(Collections.emptyList(), m.getGroup()); // check for group set
        Assert.assertEquals(Collections.emptyList(), m.getRun()); // check for group set
    }

    @Test
    public void testRun() {
        Meld m = new Meld();
        Tile t1 = new Tile("R",11,10, true);
        Tile t2 = new Tile("R",12,10,true);
        Tile t3 = new Tile("R",13,10,true);



        ArrayList<Tile> check = new ArrayList<Tile>();
        check.add(t1);
        check.add(t2);
        check.add(t3);

        boolean runOrGroup = m.checkMeld(check);

        Assert.assertEquals(true, runOrGroup);  // checking if its a meld
        Assert.assertEquals(true, m.isRun());   // checking it's a run
        Assert.assertEquals(false, m.isGroup());// checking its not group

    }

    @Test
    public void testGroup() {
        Meld m = new Meld();
        Tile t1 = new Tile("R",11,10, true);
        Tile t2 = new Tile("B",11,10,true);
        Tile t3 = new Tile("G",11,10,true);
        Tile t4 = new Tile("O",11,10,true);



        ArrayList<Tile> check = new ArrayList<Tile>();
        check.add(t1);
        check.add(t2);
        check.add(t3);
        check.add(t4);

        boolean runOrGroup = m.checkMeld(check);

        Assert.assertEquals(true, runOrGroup);  // checking if its a meld
        Assert.assertEquals(false, m.isRun());   // checking it's not a run
        Assert.assertEquals(true, m.isGroup());// checking it's a group

    }
}
