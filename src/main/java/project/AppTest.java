package project;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{

    Game game;


    /**
     * Create the test case
     *
     */
    public AppTest() {
        game = new Game();
    }

    // test line 45 to 46
    public void testPlayerHands(){
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        Player p3 = new Player("p3");

        Table t = game.getTable();
        t.assignTilesToPlayer(p1);
        System.out.println("\nPrinting p1's hand in sorted order: ");
        t.printPlayerHand(p1); // printing player 1 hand

        assertTrue(p1.getCapacity() == 14);

        //Hand rigging 3 tiles to p2
        System.out.println("\nHand rigging 3 tiles to p2");
        Tile t1 = t.getDeck().findTile("R",11);
        Tile t2 = t.getDeck().findTile("R",12);
        Tile t3 = t.getDeck().findTile("R",13);

        p2.insertTileInHand(t1);
        p2.insertTileInHand(t2);
        p2.insertTileInHand(t3);

        t.assignTilesToPlayer(p2);
        System.out.println("\nPrinting p2's hand in sorted order: ");
        t.printPlayerHand(p2); // printing player 1 hand
        ArrayList<Tile> p2_meld = new ArrayList<Tile>(Arrays.asList(t1,t2,t3));

        p2.removeTileInHand(t1);
        p2.removeTileInHand(t2);
        p2.removeTileInHand(t3);

        System.out.println("\nPrinting p2's hand in sorted order: ");
        t.printPlayerHand(p2); // printing player 1 hand

        assertTrue(game.getMeld().isRun(p2_meld)); // checking if it's a run

        System.out.println("\nThe melds are \n");
        game.getMeld().addRun(p2_meld);

    }

}
