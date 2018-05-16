package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator){
        this.calculator = calculator;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout grid = new GridLayout(2,1);
        container.setLayout(grid);
        JLabel field = new JLabel(calculator.giveValue()+"");
        JButton button = new JButton("Click!");
        button.addActionListener(new ClickListener(calculator,field));
        container.add(field);
        container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }
}
