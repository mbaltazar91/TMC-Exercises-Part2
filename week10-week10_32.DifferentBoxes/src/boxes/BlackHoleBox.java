package boxes;

public class BlackHoleBox extends Box {

    public BlackHoleBox(){}

    public void add(Thing thing){
        things.add(thing);
    }

    public boolean isInTheBox(Thing thing){
        return false;
    }
}
