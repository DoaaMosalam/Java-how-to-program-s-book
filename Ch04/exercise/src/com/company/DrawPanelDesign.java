package com.company;

import java.awt.*;
import javax.swing.*;

public class DrawPanelDesign extends JPanel {
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        int increment = 15;

        int width = getWidth();
        int height= getHeight();

        int widthStep = getWidth()/increment;
        int heightStep = getHeight()/increment;

        int count =0;
        while (count<increment){
            //  left to bottom
            g.drawLine(0,count*heightStep,(count+1)*widthStep,height);

            // right to top
            g.drawLine(width,count*heightStep,width-(count+1)*widthStep,height);

            //left to upper
            g.drawLine(width,height-count*heightStep,(count+1)*widthStep,0);

            //right to bottom
            g.drawLine( width, height - count * heightStep, width - ( count + 1 ) * widthStep, 0 );

            count++;
        }

    }

    public void drawdesigns(){
        DrawPanelDesign panelDesign = new DrawPanelDesign();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.add(panelDesign);
        app.setSize(300,300);
        app.setVisible(true);
    }
}
