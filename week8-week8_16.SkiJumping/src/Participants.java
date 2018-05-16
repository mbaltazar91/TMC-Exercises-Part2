import java.util.ArrayList;

public class Participants {

    private ArrayList<Skier> skiers;

    public Participants(){
        this.skiers = new ArrayList<Skier>();
    }

    public void addSkier(Skier skier){
        skiers.add(skier);
    }

    public ArrayList<Skier> getSkiers() {
        return skiers;
    }


}
