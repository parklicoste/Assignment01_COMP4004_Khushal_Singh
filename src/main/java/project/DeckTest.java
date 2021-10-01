package project;

import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeckTest extends TestCase {
    Deck deck = new Deck();

    @Test
    public void testDeck() {

        ArrayList<String> suit = new ArrayList<String>(Arrays.asList("R","B","G", "O"));
        Assert.assertEquals(suit , deck.getSuites());   // check for suites
        Assert.assertEquals(Collections.emptyList(), deck.getDeck()); // check for deck
    }

    @Test
    public void testMakeMyDeck() { // checking if getting 104 elements
        deck.makeDeck();
        Assert.assertEquals(104, deck.getDeck().size()); // check for deck size
    }

    @Test
    public void testMakeMyHand() { // checking if getting 104 elements
        deck.makeDeck();
        deck.shuffleDeck();
        Tile t1 = deck.makeHand();
        Tile t2 = deck.makeHand();
        Assert.assertEquals(true, t1.isOccupiedByPlayer()); // check for deck size
        Assert.assertEquals(true, t2.isOccupiedByPlayer());
    }




}
