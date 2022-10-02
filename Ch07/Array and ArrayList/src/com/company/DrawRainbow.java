package com.company;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawRainbow extends JPanel {
    private final static Color VIOLET= new Color(128,0,128);
    private final static  Color INDIGO = new Color(75,0,130);
    // colors to use in the rainbow, starting from the innermost
    // The two white entries result in an empty arc in the center
    private Color[] color = {Color.WHITE,Color.WHITE,VIOLET,INDIGO,Color.BLUE,
                            Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};

    // constructor
    DrawRainbow() {
        setBackground(Color.WHITE); // set the background to white
    } // end DrawRainbow constructor

    // draws a rainbow using concentric arcs
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);

        int radius=20;  // radius of an arc

// draw the rainbow near the bottom-center
        int centerX = getWidth()/2;
        int centerY = getHeight()-10;

        // draws filled arcs starting with the outermost
        for (int counter=color.length;counter>0;counter--){
            // set the color for the current arc
            g.setColor(color[counter-1]);

            // fill the arc from 0 to 180 degrees
            g.fillArc(centerX-counter*radius,
                     centerY-counter*radius,
                    counter * radius * 2,
                    counter * radius * 2,
                    0, 180);
        }
    }

    public static void DrawRainbowTest(){
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400,250);
        application.setVisible(true);

    }
}