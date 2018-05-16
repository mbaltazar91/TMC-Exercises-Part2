import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skier implements Comparable<Skier> {

    private String name;
    private int points;
    private Map<Integer,Jump> jumps;
    private ArrayList<Integer> lengths;

    public Skier(String name){
        this.name = name;
        this.points = 0;
        this.jumps = new HashMap<Integer, Jump>();
        lengths = new ArrayList<Integer>();
    }

    @Override
    public int compareTo(Skier skier){
        return this.points - skier.points;
    }

    @Override
    public String toString(){
        String skier = String.format("%s (%d points)", name,points);
        return skier;
    }

    public String getName(){
        return name;
    }



    public void addJump(int round){
        jumps.put(round,new Jump());

    }

    public Map<Integer,Jump> getJumps() {
        return jumps;
    }

    public void setPoints(int points){
        this.points += points;
    }

    public void lengths() {
        for (Jump jump : jumps.values()) {
            lengths.add(jump.getLength());
        }
    }

    public List<Integer> getLengths(){
        return lengths;
    }

}
