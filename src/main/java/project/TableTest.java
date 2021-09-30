package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TableTest {

    @Test
    public void testTable() {
        Table t = new Table();
        Assert.assertEquals(Collections.emptyList(), t.getPlayers()); // check for players on the table
    }
}
