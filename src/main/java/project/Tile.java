package project;

import java.util.*;

public class Tile {
    private String suite;
    private int value, rank;
    private boolean occupied;

    public Tile(){
        this.suite = "";
        this.value = 0;
        this.rank = 0;
        this.occupied = false;
    }

    public Tile(String s, int r, int v, boolean o){
        this.suite = s;
        this.value = v; // value can't be greater tha 10
        this.rank = r;
        this.occupied = o;
    }

    public int getvalue(){
        return value;
    }

    public String getSuite(){
        return this.suite;
    }

    public boolean isOccupiedByPlayer(){
        return this.occupied;
    }

    public int getRank() {
        return this.rank;
    }
}
