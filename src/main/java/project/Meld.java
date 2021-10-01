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

    public boolean checkMeld(ArrayList<Tile> m){

        boolean r ,g;
        r = this.isRun(m);
        g = this.isGroup(m);
        return r || g;
    }

    public boolean isRun(ArrayList<Tile> r){
        int len = r.size();

        String tempSuite = r.get(0).getSuite();
        int tempInt = r.get(0).getRank();

        if(len >= 3 ){
            for(int i=1; i<len; i++){
                if(r.get(i).getSuite().equals(tempSuite) && r.get(i).getRank() - 1 == tempInt){
                    tempInt = r.get(i).getRank();
                }
                else return false;
            }
            return true;
        }
        else
            return false;
    }


    public boolean isGroup(ArrayList<Tile> grp){
        int len = grp.size();
        int tempInt = grp.get(0).getRank();
        ArrayList<String> tempSuite = new ArrayList<String>();
        tempSuite.add(grp.get(0).getSuite());

        if(len == 3 || len == 4){
            for(int i=1; i<len; i++){
                if(grp.get(i).getRank() == tempInt && !tempSuite.contains(grp.get(i).getSuite())){
                    tempSuite.add(grp.get(i).getSuite());
                }
                else return false;
            }
            return true;
        }
        else
            return false;
    }
}
