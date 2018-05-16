
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public GraphicCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300,150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout grid = new GridLayout(3,1);
        container.setLayout(grid);
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField();
        JPanel panel = new JPanel(new GridLayout(1,3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton reset = new JButton("Z");
        reset.setEnabled(false);
        EventHandler handler = new EventHandler(calculator,input,output,plus,minus,reset);
        plus.addActionListener(handler);
        minus.addActionListener(handler);
        reset.addActionListener(handler);
        panel.add(plus);
        panel.add(minus);
        panel.add(reset);
        container.add(output);
        container.add(input);
        container.add(panel,BorderLayout.SOUTH);

    }

    public JFrame getFrame() {
        return frame;
    }
}
