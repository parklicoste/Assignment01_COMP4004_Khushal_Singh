package project;

import junit.framework.TestCase;

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

    public void testPlayerHands(){
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        Player p3 = new Player("p3");
    }

}
