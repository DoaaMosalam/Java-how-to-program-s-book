package com.company;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.color.*;
import javax.swing.*;

public class DrawSmiley extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // Draw the face.
        g.setColor(Color.yellow);
        g.fillOval(10,10,200,200);

        //draw the eyes.
        g.setColor(Color.BLACK);
        g.fillOval(55,65,30,30);
        g.fillOval(135,65,30,30);

        //draw the  mouse.
        g.fillOval(50,110,120,60);

        // "touch up" the mouth into a smile
        g.setColor( Color.YELLOW );
        g.fillRect( 50, 110, 120, 30 );
        g.fillOval( 50, 120, 120, 40 );
    }

    public void DrawSmileyTest(){
        DrawSmiley panel = new DrawSmiley();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(230,250);
        app.setVisible(true);
    }
}
