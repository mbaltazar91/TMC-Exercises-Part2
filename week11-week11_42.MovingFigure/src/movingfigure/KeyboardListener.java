package movingfigure;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener{

    private Figure figure;
    Component component;

    public KeyboardListener(Component component, Figure figure){
        this.component = component;
        this.figure = figure;
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            figure.move(-5,0);
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            figure.move(5,0);
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            figure.move(0,-5);
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            figure.move(0,5);
        }

        component.repaint();
    }

    public void keyReleased(KeyEvent e){}

    public void keyTyped(KeyEvent e){}



}
