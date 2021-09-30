package project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
    private ArrayList<Tile> deckList;
    private ArrayList<String> suites;

    public Deck() {
        deckList = new ArrayList<Tile>();
        suites = new ArrayList<String>();

        suites.add("R");
        suites.add("B");
        suites.add("G");
        suites.add("O");
    }

    public ArrayList<String> getSuites(){
        return this.suites;
    }

    public ArrayList<Tile> getDeck(){
        return this.deckList;
    }
}
