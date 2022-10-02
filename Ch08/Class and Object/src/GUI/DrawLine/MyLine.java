package GUI.DrawLine;
import java.awt.*;


public class MyLine {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color myColor;

    public MyLine(int x1,int y1,int x2,int y2,Color color){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        myColor=color;
    }

    public void drawLine(Graphics g){
        g.setColor(myColor);
        g.drawLine(x1,y1,x2,y2);
    }
}
