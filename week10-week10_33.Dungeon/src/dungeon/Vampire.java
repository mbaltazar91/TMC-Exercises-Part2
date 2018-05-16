package dungeon;

import java.util.Random;

public class Vampire extends Character {

    Random random;

    public Vampire() {
        random = new Random();

    }

    public void setXPos(int length) {
        xPos = random.nextInt(length);
    }

    public void setYPos(int height) {
        yPos = random.nextInt(height);
    }


    @Override
    public String toString() {
        String vampire = String.format("v %d %d", xPos, yPos);
        return vampire;
    }






    }


