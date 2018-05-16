import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;


    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }

    }

    public int totalWeight(){
        int weight = 0;
        for(Thing thing : things){
            weight += thing.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        String str;
        if (things.isEmpty()) {
            str = String.format("empty (%d kg)", things.size(), totalWeight());
        }
        else if (things.size() == 1) {
            str = String.format("%d thing (%d kg)", things.size(), totalWeight());
        }
        else {
            str = String.format("%d things (%d kg)", things.size(), totalWeight());
        }
        return str;
    }

    public void printThings(){
        for(Thing thing : things){
            System.out.println(thing);
        }
    }

    public Thing heaviestThing(){
        if(!things.isEmpty()) {
            Thing heaviest = things.get(0);
            for (Thing thing : things) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
            return heaviest;
        }
        return null;
    }
}



