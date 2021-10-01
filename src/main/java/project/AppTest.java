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

    // test line 45 to 48
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
        t.printPlayerHand(p2); // printing player 2 hand

        assertTrue(game.getMeld().isRun(p2_meld)); // checking if it's a run

        System.out.println("\nThe melds are \n");
        game.getMeld().addRun(p2_meld);

        System.out.println("\nHand rigging 6 tiles to p3");
        Tile t4 = t.getDeck().findTile("R",13);
        Tile t5 = t.getDeck().findTile("B",13);
        Tile t6 = t.getDeck().findTile("G",13);

        Tile t7 = t.getDeck().findTile("G",2);
        Tile t8 = t.getDeck().findTile("R",2);
        Tile t9 = t.getDeck().findTile("O",2);


        p3.insertTileInHand(t4);
        p3.insertTileInHand(t5);
        p3.insertTileInHand(t6);
        p3.insertTileInHand(t7);
        p3.insertTileInHand(t8);
        p3.insertTileInHand(t9);

        t.assignTilesToPlayer(p3);

        System.out.println("\nPrinting p3's hand in sorted order: ");
        t.printPlayerHand(p3); // printing player 3 hand
        ArrayList<Tile> p3_meld_1 = new ArrayList<Tile>(Arrays.asList(t4,t5,t6));
        ArrayList<Tile> p3_meld_2 = new ArrayList<Tile>(Arrays.asList(t7,t8,t9));

        assertTrue(game.getMeld().isGroup(p3_meld_1));
        assertTrue(game.getMeld().isGroup(p3_meld_2));

        game.getMeld().addGroup(p3_meld_1);
        game.getMeld().addGroup(p3_meld_2);


        System.out.println("\nThe melds are \n");
        game.getMeld().printMelds();

        p3.removeTileInHand(t4);
        p3.removeTileInHand(t5);
        p3.removeTileInHand(t6);
        p3.removeTileInHand(t7);
        p3.removeTileInHand(t8);
        p3.removeTileInHand(t9);

        System.out.println("\nPrinting p3's hand in sorted order: ");
        t.printPlayerHand(p3); // printing player 3 hand


        Tile t10 = t.getDeck().findTile("R",12);
        Tile t11 = t.getDeck().findTile("B",12);
        Tile t12 = t.getDeck().findTile("O",12);

//        for(int i=0; i<14; i++){
//            p1.getPlayer_hand().get(i).setOccupied(false);
//        }

//        p1.getPlayer_hand().clear();
        p1.getPlayer_hand().set(0,t10);
        p1.getPlayer_hand().set(1,t11);
        p1.getPlayer_hand().set(2,t12);
        p1.getPlayer_hand().remove(3);
        p1.insertTileInHand(t.getDeck().drawOneTile());


//        t.assignTilesToPlayer(p1);
        System.out.println("\nPrinting p1's hand in sorted order: ");
        t.printPlayerHand(p1); // printing player 1 hand

        ArrayList<Tile> p1_meld = new ArrayList<Tile>(Arrays.asList(t10,t11,t12));
        assertTrue(game.getMeld().isGroup(p1_meld));
        game.getMeld().addGroup(p1_meld);

        p1.removeTileInHand(t10);
        p1.removeTileInHand(t11);
        p1.removeTileInHand(t12);

        System.out.println("\nPrinting p1's hand in sorted order: ");
        t.printPlayerHand(p1); // printing player 3 hand

        System.out.println("\nThe melds are \n");
        game.getMeld().printMelds();









    }



}
