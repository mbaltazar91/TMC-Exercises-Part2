package movingfigure;

import java.awt.*;

public abstract class Figure {

    private int x;
    private int y;

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Figure(){}

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(int xDiff, int yDiff){
        x+=xDiff;
        y+=yDiff;
    }

    public abstract void draw(Graphics graphics);
}
