package project;

import java.util.ArrayList;
import java.util.Arrays;

public class Printlist {
    public Printlist(){}

    public void printArrayListOfTiles(ArrayList<Tile> tiles){
        String[] tileArray = new String[tiles.size()];
        for (int i =0; i < tiles.size() ; i++) {
            tileArray[i] = tiles.get(i).toString();
        }

        System.out.println("{ " + Arrays.toString(tileArray).replaceAll("\\[|\\]|,|", "") + " }");
    }
}
