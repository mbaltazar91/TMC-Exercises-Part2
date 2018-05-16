package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {

    private Calculator calculator;
    private JLabel text;

    public ClickListener(Calculator calculator, JLabel text){
        this.calculator = calculator;
        this.text = text;
    }

    public void actionPerformed(ActionEvent ae){
        calculator.increase();
        text.setText(calculator.giveValue()+"");
    }
}
