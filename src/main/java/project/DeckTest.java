package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeckTest {

    @Test
    public void testDeck() {
        Deck deck = new Deck();
        ArrayList<String> suit = new ArrayList<String>(Arrays.asList("R","B","G", "O"));
        Assert.assertEquals(suit , deck.getSuites());   // check for suites
        Assert.assertEquals(Collections.emptyList(), deck.getDeck()); // check for deck
    }


}
