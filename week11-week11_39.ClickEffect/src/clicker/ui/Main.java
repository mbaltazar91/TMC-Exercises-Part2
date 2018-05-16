package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Calculator c = new PersonalCalculator();
        UserInterface ui = new UserInterface(c);
        SwingUtilities.invokeLater(ui);
    }
}
