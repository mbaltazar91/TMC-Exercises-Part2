package boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Box {

    protected List<Thing> things = new ArrayList<Thing>();

    public abstract void add(Thing thing);

    public void add(Collection<Thing> things) {
        for (Thing thing : things) {
            add(thing);
        }
    }

    public abstract boolean isInTheBox(Thing thing);
}
