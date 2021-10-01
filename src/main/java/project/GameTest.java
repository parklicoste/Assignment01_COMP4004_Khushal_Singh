package project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GameTest {
    Game g = new Game();

    @Test
    public void testGameTablePlayers() {
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        Player p3 = new Player("p3");

        Table t = g.getTable();

        t.getPlayers().add(p1);
        t.getPlayers().add(p2);
        t.getPlayers().add(p3);

        Assert.assertEquals(3, t.getPlayers().size()); // check for players in the game on the table
        g.setCurrentPlayer(p1);
        Assert.assertEquals(p1, g.getCurrentPlayer());
    }
}
