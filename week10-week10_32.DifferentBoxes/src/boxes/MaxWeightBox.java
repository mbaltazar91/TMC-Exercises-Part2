package boxes;

public class MaxWeightBox extends Box {

    private int maxWeight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(Thing thing) {
        int totalWeight = 0;
        for(Thing t : things){
            totalWeight += t.getWeight();
        }
        if(totalWeight + thing.getWeight()<=maxWeight){
            things.add(thing);
        }
    }

    public boolean isInTheBox(Thing thing){
        return(things.contains(thing));
    }
}
