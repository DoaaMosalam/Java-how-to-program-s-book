package com.company;
import java.awt.*;
import javax.swing.*;



public class Shapes extends JPanel {
    private int choice;
    // constructor sets the user's choice

    public Shapes(int userCoice){
        choice = userCoice;
    }

    public Shapes() {

    }

    // draws a cascade of shapes starting from the top-left corner
    public void paintComponent( Graphics g ){
        super.paintComponent(g);
        for (int i =0;i<10;i++){

            // pick the shape based on the user's choice
            switch (choice){
                case 1: // draw Rectangle
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 2: // draw Ovals
                    g.drawOval( 10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10 );
                    break;
            }
        }
    }


    public void ShapesTest(){
//        String input = JOptionPane.showInputDialog("\"Enter 1 to draw rectangles\n" +
//                "Enter 2 to draw ovals");
//        int choice = Integer.parseInt(input);

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to draw rectangles\n"
                        + "Enter 2 to draw ovals"));

        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        application.add(panel);

        application.setSize(300,300);

        application.setVisible(true);


    }


}
