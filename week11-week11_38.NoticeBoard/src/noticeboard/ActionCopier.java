package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ActionCopier implements ActionListener {

    private JTextField text1;
    private JLabel text2;

    public ActionCopier(JTextField text1,JLabel text2){
        this.text1 = text1;
        this.text2 = text2;
    }

    public void actionPerformed(ActionEvent ae){
        if(!text1.getText().isEmpty()) {
            text2.setText(text1.getText());
            text1.setText("");
        }
        else{
            text1.setText(text2.getText());
            text2.setText("");
        }
    }
}
