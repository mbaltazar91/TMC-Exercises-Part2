package boxes;

public class OneThingBox extends Box {

    public OneThingBox(){}


    public void add(Thing thing){
        if(things.size()<1){
            things.add(thing);
        }
    }

    public boolean isInTheBox(Thing thing){
        return things.contains(thing);
    }
}
