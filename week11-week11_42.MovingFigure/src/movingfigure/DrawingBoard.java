package movingfigure;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel {

    Figure figure;

    public DrawingBoard(Figure figure){

        this.figure = figure;
    }

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        figure.draw(graphics);
    }
}
