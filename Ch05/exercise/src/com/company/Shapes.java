package com.company;

import javax.swing.*;
import java.awt.*;

public class Shapes  extends JPanel {
    private int choice;

    public Shapes(){}

    public Shapes( int userChoice){
        choice = userChoice;
    }

    public void paintComponent( Graphics g ) {

        super.paintComponent(g);
       int radius = 25;

        for (int i = 0;i< 12 ;i++){
            g.drawOval(250-(radius/2), 250-(radius/2), radius, radius);
            g.setColor(Color.BLUE);
            radius += 10;

           if (radius + 10 < 250) {

//        int width = getWidth();
//        int height = getHeight();
//        int centerPosX = width / 2;
//        int centerPosY = height / 2;
//
//        for (int i = 0; i < 12; i++) {
//            g.drawOval(centerPosX, centerPosY, i * 10, i * 10);
//            centerPosX -= 5;
//            centerPosY -= 5;
            }
        }
    }


    public void shapesTes(){

     //   int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter Your 1 to Draw Circle"));

        Shapes panel = new Shapes(choice);


        JFrame app = new JFrame();

        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250,250);

       // app.setColor(Color.BLUE);
        app.setVisible(true);


    }
}
