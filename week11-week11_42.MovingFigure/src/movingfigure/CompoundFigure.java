package movingfigure;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure {

    private List<Figure> figures;

    public CompoundFigure(){
        figures = new ArrayList<Figure>();
    }

    @Override
    public void move(int xDiff, int yDiff){
        for(Figure figure : figures){
            figure.move(xDiff,yDiff);
        }
    }

    public void draw(Graphics graphics){
        for(Figure figure : figures){
            figure.draw(graphics);
        }
    }

    public void add(Figure figure){
        figures.add(figure);
    }
}
