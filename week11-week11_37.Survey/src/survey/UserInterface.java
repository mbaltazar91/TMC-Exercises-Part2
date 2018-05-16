package survey;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200,300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container){
        BoxLayout boxLayout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);
        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add(new JLabel("Why?"));
        JRadioButton rad1 = new JRadioButton("No reason.");
        JRadioButton rad2 = new JRadioButton("Because it is fun!");
        container.add(rad1);
        container.add(rad2);
        ButtonGroup group = new ButtonGroup();
        group.add(rad1);
        group.add(rad2);
        container.add(new JButton("Done!"));
    }


    public JFrame getFrame() {
        return frame;
    }
}
