package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame);
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout grid = new GridLayout(3,1);
        container.setLayout(grid);
        JTextField text1 = new JTextField("Text");
        JButton button = new JButton("Copy!");
        JLabel text2 = new JLabel();
        button.addActionListener(new ActionCopier(text1,text2));

        container.add(text1);
        container.add(button);
        container.add(text2);



    }
}
