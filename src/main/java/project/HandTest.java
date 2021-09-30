package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HandTest {
    @Test
    public void testHand() {
        Hand h = new Hand();
        Assert.assertEquals(Collections.emptyList(), h.getHand()); // check for deck
    }
}
