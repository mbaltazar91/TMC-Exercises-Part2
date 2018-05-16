package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> movables;

    public Group(){
        movables = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable){
        movables.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable movable : movables){
            movable.move(dx,dy);
        }
    }

    public String toString(){
        String str = "";
        for(Movable movable : movables){
            str+=movable.toString();
            str+="\n";
        }
        return str;
    }
}
