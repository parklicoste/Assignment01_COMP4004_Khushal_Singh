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

    public void makeDeck(){
        for(int i=0; i<suites.size(); i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<13; k++){
                    if(k+1 > 10){
                        deckList.add(new Tile(suites.get(i),k+1, 10, false ));
                    }
                    else{
                        deckList.add(new Tile(suites.get(i), k+1, k+1, false));
                    }

                }
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deckList);
    }

    public Tile makeHand() { // sending 14 tiles one by one
//        Tile sendTile = new Tile();
        for (Tile t : deckList) {
            if (t.isOccupiedByPlayer() != true) {
                t.setOccupied(true);
                return t;
//                sendTile = t;
//                break;
            }
        }
//        if(sendTile.getvalue() == 0) return null;
//        else return sendTile;
        return null;
    }

    public Tile drawOneTile() { // for drawing 1 tile after 14
        for (int i = 0; i < 104; i++) {
            if (!deckList.get(i).isOccupiedByPlayer())
                return deckList.get(i);
        }
        return null;
    }

    public Tile findTile(String suite, int rank){
        for(Tile t: deckList){
            if(t.getRank() == rank && t.getSuite() == suite && !t.isOccupiedByPlayer()){
                t.setOccupied(true);
                return t;
            }
        }
        return null;
    }


    public void printDeck(){
//        for (Tile t : deckList) {
//            t.toString();
//        }
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String[] tileArray = new String[deckList.size()];
        for (int i = 0; i < deckList.size(); i++) {
            tileArray[i] = this.deckList.get(i).toString();
            //t.toString();
        }

        return "{ " + Arrays.toString(tileArray).replaceAll("\\[|\\]|,|", "") + " }";
    }
}
