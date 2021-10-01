package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class MeldTest {

    @Test
    public void testMeldGroupAndRun() {
        Meld m = new Meld();
        Assert.assertEquals(Collections.emptyList(), m.getGroup()); // check for group set
        Assert.assertEquals(Collections.emptyList(), m.getRun()); // check for group set
    }
}
