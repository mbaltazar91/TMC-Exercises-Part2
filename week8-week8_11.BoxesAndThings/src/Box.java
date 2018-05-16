import java.util.ArrayList;
import java.util.List;

public class Box implements ToBeStored {

    private List<ToBeStored> things;
    private double maxWeight;

    public Box(double maxWeight){
        things = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

    public double weight(){
        double totalWeight = 0.0;
        for(ToBeStored t : things){
            totalWeight+=t.weight();
        }
        return totalWeight;
    }

    public void add(ToBeStored thing){
        if(this.weight()+thing.weight()<=maxWeight){
            things.add(thing);
        }
    }

    @Override
    public String toString(){
        String box = String.format("Box: %d things, total weight %.1f kg",things.size(),weight());
        return box;
    }
}
