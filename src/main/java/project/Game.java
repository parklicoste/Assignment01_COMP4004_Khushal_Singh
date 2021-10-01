package project;

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
}
