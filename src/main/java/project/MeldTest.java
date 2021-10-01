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
        Assert.assertEquals(true, m.isRun(check));   // checking it's a run
        Assert.assertEquals(false, m.isGroup(check));// checking its not group

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
        Assert.assertEquals(false, m.isRun(check));   // checking it's not a run
        Assert.assertEquals(true, m.isGroup(check));// checking it's a group
    }

    @Test
    public void testAddSettoMeld() {
        Meld m = new Meld();

        Tile t1 = new Tile("R",11,10, true);
        Tile t2 = new Tile("R",12,10,true);
        Tile t3 = new Tile("R",13,10,true);



        ArrayList<Tile> check1 = new ArrayList<Tile>();
        check1.add(t1);
        check1.add(t2);
        check1.add(t3);

        boolean runOrGroup1 = m.checkMeld(check1);

        Assert.assertEquals(true, runOrGroup1);  // checking if its a meld
        Assert.assertEquals(true, m.isRun(check1));   // checking it's a run
        Assert.assertEquals(false, m.isGroup(check1));// checking its not group

        m.addRun(check1);   // Adding the run to the run list
        Assert.assertEquals(1, m.getRun().size());

        Tile t4 = new Tile("R",11,10, true);
        Tile t5 = new Tile("B",11,10,true);
        Tile t6 = new Tile("G",11,10,true);
        Tile t7 = new Tile("O",11,10,true);



        ArrayList<Tile> check2 = new ArrayList<Tile>();
        check2.add(t4);
        check2.add(t5);
        check2.add(t6);
        check2.add(t7);

        boolean runOrGroup2 = m.checkMeld(check2);

        Assert.assertEquals(true, runOrGroup2);  // checking if its a meld
        Assert.assertEquals(false, m.isRun(check2));   // checking it's not a run
        Assert.assertEquals(true, m.isGroup(check2));// checking it's a group

        m.addGroup(check2);   // Adding the group to the group list
        Assert.assertEquals(1, m.getGroup().size());

        Assert.assertEquals(2, m.getAllMelds().size()); // Checking all the melds 1 run + 1 group
    }
}
