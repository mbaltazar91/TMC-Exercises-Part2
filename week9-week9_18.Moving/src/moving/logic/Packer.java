package moving.logic;

import moving.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(boxesVolume));
        int boxNum = 1;
        for(Thing thing : things){
            if(!boxes.get(boxNum-1).addThing(thing)){
                boxes.add(new Box(boxesVolume));
                boxNum++;
                boxes.get(boxNum-1).addThing(thing);
            }

            }

        return boxes;

        }
    }


