package com.company;
import java.awt.*;
import javax.swing.*;


public class DrawPanel extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
// draw a line from the upper-left to the lower-right
        g.drawLine(0,0,width,height);

 // draw a line from the lower-left to the upper-right
        g.drawLine(0,height,width,0);

    }


    public void DrawPanelTest(){
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250,250);
        app.setVisible(true);
    }

}
