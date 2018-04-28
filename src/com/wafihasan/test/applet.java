//<applet code="applet1.class" width="400" height="400"></applet>
package com.wafihasan.test;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class applet extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(2,3, 300, 300);
        g.setColor(Color.magenta);
        g.drawString("Hello", 10, 30);
        g.setColor(Color.red);
        g.fillOval(20, 30, 50, 50);
    }
}
