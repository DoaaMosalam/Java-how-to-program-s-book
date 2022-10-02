package com.company;

import javax.swing.*;
import java.awt.Graphics;

public class DrawPanelBetweenLines extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int increment = 15;

       int width = getWidth();
       int height = getHeight();

       int widthStep = width /increment;
       int heightStep = height / increment;

       int count =0;
       while (count < increment){
           // lines fanning from the top-left
           g.drawLine( 0, 0,  count * widthStep, height - count * heightStep );

           //lines fanning from the bottom -right
           g.drawLine(width,height,count * widthStep,height - count * heightStep);

           //lines fanning from the bottom-left
           g.drawLine(0,height,count * widthStep, count * heightStep);

           //lines fanning from the top-right
           g.drawLine(width,0,count * widthStep,count * heightStep);
           count++;
       }


    }
    public void DrawPanelTest(){

        DrawPanelBetweenLines panel = new DrawPanelBetweenLines();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250,250);
        app.setVisible(true);
    }

    }
