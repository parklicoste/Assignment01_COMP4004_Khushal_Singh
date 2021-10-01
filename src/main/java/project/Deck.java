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
}
