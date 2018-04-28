package com.wafihasan.test;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class SwingApp extends JApplet
{
    JPanel panel;
    JButton button;
    JButton button2;
    JTextField textField;
    JCheckBox checkBox;

    @Override
    public void init()
    {
        panel = new JPanel();
        button = new JButton("Click this shit");
        button2 = new JButton("Now click this shit");
        textField = new JTextField("This is the Default Text Box");
        checkBox = new JCheckBox("CB", true);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textField.setText("Button 1 clicked");
            }
        });
        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textField.setText("Button 2 clicked");
            }
        });
        checkBox.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                if(checkBox.isSelected())
                    textField.setText("Checkbox selected");
                if (!checkBox.isSelected())
                    textField.setText("Checkbox deselected");
            }
        });

        panel.add(checkBox);
        panel.add(button);
        panel.add(button2);
        panel.add(textField);
        add(panel);
    }
}