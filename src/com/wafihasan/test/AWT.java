package com.wafihasan.test;

import javax.swing.*;
import java.awt.*;

public class AWT extends JApplet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawRect(20, 20, 50, 50);
        g.setColor(Color.yellow);
        g.fillRect(80, 20, 50, 50);
        g.clearRect(20, 20, 50, 50);
    }

}