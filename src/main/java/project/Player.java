package project;

import java.util.*;

public class Player {
    private String name;
    Hand player_hand;

    public Player() {
        this.name= "";
        this.player_hand = new Hand();
    }

    public Player(String n) {
        this.name = n;
        this.player_hand = new Hand();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name= n;
    }

    public void setPlayer_hand(ArrayList<Tile> list) {
        this.player_hand.setHand(list);
    }

    public ArrayList<Tile> getPlayer_hand() {
        return player_hand.getHand();
    }
}
