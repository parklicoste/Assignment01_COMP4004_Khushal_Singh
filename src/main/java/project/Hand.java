package project;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Tile> hand;

    public Hand(){
        hand = new ArrayList<Tile>();
    }

    public void setHand(ArrayList<Tile> h) {
        this.hand = h;
    }

    public ArrayList<Tile> getHand() {
        return this.hand;
    }

    public void insert(Tile t){ // function for rigging the tiles for player
        this.hand.add(t);
    }
}
