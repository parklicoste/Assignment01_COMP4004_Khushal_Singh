package project;

import java.util.*;

public class Player {
    private String name;

    public Player() {
        this.name= "Bob";
    }

    public Player(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name= n;
    }
}
