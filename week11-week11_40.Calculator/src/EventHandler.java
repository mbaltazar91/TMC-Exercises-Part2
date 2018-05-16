import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {

    Calculator calculator;
    JTextField input;
    JTextField output;
    JButton plus;
    JButton minus;
    JButton reset;

    public EventHandler(Calculator calculator, JTextField input, JTextField output,JButton plus, JButton minus, JButton reset){
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.plus = plus;
        this.minus = minus;
        this.reset = reset;
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource()==plus){
            try {
                calculator.add(Integer.parseInt(input.getText()));
                output.setText(calculator.getValue() + "");

            }
            catch(Exception e){}
        }
        if(event.getSource()==minus){
            try {
                calculator.subtract(Integer.parseInt(input.getText()));
                output.setText(calculator.getValue() + "");
            }
            catch (Exception e) {}
        }
        if(event.getSource()==reset){
            calculator.reset();
            output.setText("0");
            reset.setEnabled(false);
        }
        if(calculator.getValue()!=0){//Integer.parseInt()!!!
            reset.setEnabled(true);
        }
        else{
            reset.setEnabled(false);
        }
        input.setText("");
    }
}
