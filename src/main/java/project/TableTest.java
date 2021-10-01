package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TableTest {

    Table t = new Table();

    @Test
    public void testTable() {

        Assert.assertEquals(Collections.emptyList(), t.getPlayers()); // check for players on the table
    }

    @Test
    public void testTablePlayers() {
       Player p1 = new Player("p1");
       Player p2 = new Player("p2");
       Player p3 = new Player("p3");

       t.insertPlayer(p1);
       t.insertPlayer(p2);
       t.insertPlayer(p3);

        Assert.assertEquals(3, t.getPlayers().size()); // check for players on the table

    }
}
