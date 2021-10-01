package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Table table;
    Player currPlayer;

    public Game(){
        table = new Table();
        currPlayer = new Player();
    }

    public void initializeGame() {
        table.initialize();
    }

    public Player getCurrentPlayer() {
        return currPlayer;
    }

    public void setCurrentPlayer(Player p){
        this.currPlayer = p;
    }

    public Table getTable() {
        return table;
    }

    public void playGame(){
        int count = 0;
        ArrayList<Player> gamers = table.getPlayers();

        while(count != gamers.size()){

            currPlayer = gamers.get(count);
            System.out.println(currPlayer.getName() + "'s turn ");

            System.out.println("Please choose from 3 options below");
            System.out.println("1) Make meld");
            System.out.println("2) Draw a Card");
            System.out.println("3) Pass Turn");

            Scanner myObj = new Scanner(System.in);  //taken from yhatzee game
            int option = myObj.nextInt();

            while (option < 1 || option > 3) {
                System.out.println("Invalid Input plz try again, choose 1,2 or 3: ");
                option = myObj.nextInt();
            }

            if(option == 1){
                // make a meld group or run
                System.out.println("Cannot make a meld");
            }

            else if(option == 2){
                Tile t = table.getDeck().drawOneTile();
                currPlayer.insertTileInHand(t);
            }
            else continue;



            // options for the player 1, 2, 3
            table.assignTilesToPlayer(currPlayer);
            table.printPlayerHand(currPlayer);
            count++;



//            System.out.println("Checking the Meld");
//            Meld m = new Meld();
//
//            Tile t1 = new Tile("G",11,10, true);
//            Tile t2 = new Tile("R",12,10,true);
//            Tile t3 = new Tile("R",13,10,true);
//
//
//
//            ArrayList<Tile> check = new ArrayList<Tile>();
//            check.add(t1);
//            check.add(t2);
//            check.add(t3);
//
//            System.out.println(m.checkMeld(check));
//            break;

        }
    }
}
