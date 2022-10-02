package GUI.DrawLine;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {
    private Random randomNumber = new Random();
    private MyLine[] line;
//constructor
    public DrawPanel(){
        setBackground(Color.white);
        line = new MyLine[5 + randomNumber.nextInt(5)];
        //creat line
        for (int i = 0; i <line.length ; i++) {
            // generate random coordinates
            int x1 = randomNumber.nextInt(300);
            int y1 = randomNumber.nextInt(300);
            int x2 = randomNumber.nextInt(300);
            int y2 = randomNumber.nextInt(300);

            // generate random coordinates
            Color color = new Color(randomNumber.nextInt(256),
                    randomNumber.nextInt(256),randomNumber.nextInt(256));

            line[i] = new MyLine(x1,y1,x2,y2,color);
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (MyLine line :line) {
            line.drawLine(g);
        }
    }

    public static void  testDraw(){
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }
}
