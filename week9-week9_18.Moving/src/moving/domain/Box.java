package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public int getVolume(){
        int sum = 0;
        for(Thing thing : things){
            sum += thing.getVolume();
        }
        return sum;
    }

    public boolean addThing(Thing thing) {
        if (maximumCapacity - this.getVolume() >= thing.getVolume()) {
            things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String box = String.format("  things in the box: %d dm^3",this.getVolume());
        return box;
    }
}
