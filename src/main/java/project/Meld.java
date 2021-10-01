package project;

import java.util.ArrayList;


public class Meld {
    ArrayList<ArrayList<Tile>> group;
    ArrayList<ArrayList<Tile>> run;

    public Meld() {
        group = new ArrayList<ArrayList<Tile>>();
        run = new ArrayList<ArrayList<Tile>>();
    }

    public ArrayList<ArrayList<Tile>> getGroup() {
        return group;
    }

    public ArrayList<ArrayList<Tile>> getRun() {
        return run;
    }
}
