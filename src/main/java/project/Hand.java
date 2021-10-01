package project;

import java.util.ArrayList;
import java.util.Arrays;

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
        this.sortHand();
    }

    public void sortHand(){
        //        Collections.sort(this.hand);
        //        ArrayList<ArrayList<Tile>> colors = new ArrayList<ArrayList<Tile>>();
        ArrayList<Tile> red = new ArrayList<Tile>();     //arraylist for red
        ArrayList<Tile> black = new ArrayList<Tile>();    //arraylist for blue
        ArrayList<Tile> green = new ArrayList<Tile>();    //arraylist for green
        ArrayList<Tile> orange = new ArrayList<Tile>();   //arraylist for orange
        for(Tile t: this.hand){
            String color = t.getSuite();
            if(color == "R") red.add(t);
            else if(color == "B") black.add(t);
            else if(color == "G") green.add(t);
            else orange.add(t);
        }
        hand.removeAll(hand);               //clearing the hand
        hand.addAll(sortHandHelper(red));   // adding the sorted red list
        hand.addAll(sortHandHelper(black));
        hand.addAll(sortHandHelper(green));
        hand.addAll(sortHandHelper(orange));


    }

    public ArrayList<Tile> sortHandHelper(ArrayList<Tile> list){   // using insertion sort by rank
        // reference https://www.geeksforgeeks.org/insertion-sort/

        for(int i=1; i < list.size(); i++){
            int pos = i - 1;
            Tile item = list.get(i);

            while (pos >=0  &&  list.get(pos).getRank() > item.getRank()) {
                list.set(pos+1, list.get(pos));
                pos--;
            }
            list.set(pos + 1, item);

        }
        return list;
    }

    public void printHand() {
        Printlist p = new Printlist();
        p.printArrayListOfTiles(this.hand);
//        System.out.println(this.hand.toString());
    }

    @Override
    public String toString() {
        String[] tileArray = new String[14];
        for (int i = 0; i < 14 ; i++) {
            tileArray[i] = this.hand.get(i).toString();
            //t.toString();
        }

        return "{ " + Arrays.toString(tileArray).replaceAll("\\[|\\]|,|", "") + " }";
    }

}
