package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Table {

    private ArrayList<Player> players;
    private Deck deck;

    public Table() {
        players = new ArrayList<Player>();
        deck =  new Deck();
        deck.makeDeck();   // making a new deck
        deck.shuffleDeck(); // shuffling the tiles inside the deck
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public Deck getDeck() {
        return this.deck;
    }

    // how many players
    // make those players
    // assign random 14 tiles to player
    public void initialize(){
        System.out.println("Please select the number of players playing the game, max 3 players: ");
        Scanner myObj = new Scanner(System.in);  //taken from yhatzee game
        int numPlayer = myObj.nextInt();

        while (numPlayer < 0 || numPlayer > 3) {
            System.out.println("Invalid Input plz try again, max 3 players: ");
            numPlayer = myObj.nextInt();
        }
        if (numPlayer == 0) System.out.println("\n**** ---- Game ended ---- ****\n");
        else{
            String name;
            myObj.nextLine();
            for(int i = 0; i < numPlayer; i++){
                System.out.println("Please enter the name of player " + (i+1));
                name = myObj.nextLine();
                players.add(new Player(name));
                System.out.println("Player "+ (i+1) +" added" );
            }
        }

//        for(int i = 0; i < numPlayer; i++){       // for displaying players
//            System.out.println(players.get(i).getName());
//        }

    }

    public void insertPlayer(Player p){
        players.add(p);
    }

    public void assignTilesToPlayer(Player p){

        for(int i=0; i<104 && p.getCapacity() < 14; i++)
            if(deck.makeHand() != null)
                this.insertTileInPlayerHand(deck.makeHand(), p);
            else
                System.out.println("No More Tiles Left");
    }

    public void insertTileInPlayerHand(Tile t, Player p) {
        p.insertTileInHand(t);
    }

    public void printPlayerHand(Player p){
        Printlist pl  = new Printlist();
        pl.printArrayListOfTiles(p.getPlayer_hand());
    }

    public void printDeck(){
        deck.printDeck();
    }

}