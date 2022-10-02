package com.company;
import java.awt.*;
import java.util.Random;
import javax.swing.*;


public class RandomlyGeneratedShapes extends JPanel {

    private static final Random randomShape = new Random();
    public void paintComponent( Graphics g ){
        super.paintComponent( g );
        int width = getWidth();
        int height = getHeight();
        int shape;//holding the shape
        int colour;//holding the colour
        int x;//holding x coordinate
        int y;//holding y coordinate
        int shapeWidth;
        int shapeHeight;
        for( int i = 0; i < 10; i++ ){
            //determine the coordinates and size of shapes to draw
            shape = decideShape();
            colour = decideColour();
            x = decideCoordinates( width );
            y = decideCoordinates( height );
            shapeWidth = decideSize( width );
            shapeHeight = decideSize( height );
            //switch statement for colour
            switch( colour ){
                case 1:
                    g.setColor( Color.BLACK );
                    break;
                case 2:
                    g.setColor( Color.BLUE );
                    break;
                case 3:
                    g.setColor( Color.CYAN );
                    break;
                case 4:
                    g.setColor( Color.DARK_GRAY );
                    break;
                case 5:
                    g.setColor( Color.GRAY );
                    break;
                case 6:
                    g.setColor( Color.GREEN );
                    break;
                case 7:
                    g.setColor( Color.LIGHT_GRAY );
                    break;
                case 8:
                    g.setColor( Color.MAGENTA );
                    break;
                case 9:
                    g.setColor( Color.ORANGE );
                    break;
                case 10:
                    g.setColor( Color.PINK );
                    break;
                case 11:
                    g.setColor( Color.RED );
                    break;
                case 12:
                    g.setColor( Color.WHITE );
                    break;
                case 13:
                    g.setColor( Color.YELLOW );
                    break;
            }//colour switch
            //switch statement for shape
            switch( shape ){
                case 1:
                    g.fillOval( x, y, shapeWidth, shapeHeight );
                    break;
                case 2:
                    g.fillRect( x, y, shapeWidth, shapeHeight );
                    break;
            }//shape switch
        }//end of for loop
    }//end of paintComponent method
    //choose randomly the shape, 1 for oval, 2 for rectangle
    public static int decideShape(){
        int theShape = 1 + randomShape.nextInt(2);
        //  System.out.printf("Shape value returned is %d\n", theShape);
        return theShape;
    }
    //choose randomly the colour among the 13 color objects
    public static int decideColour(){
        int theColour = 1 + randomShape.nextInt(13);//choose from the 13 predefined objects
        //System.out.printf("Colour value returned is %d\n", theColour);
        return theColour;
    }
    //choose random coordinates, x and y depending on the parameter passed to it
    public static int decideCoordinates( int origin ){
        int coordinate = randomShape.nextInt( origin + 1 );
        //System.out.printf("Coordinate value returned is %d\n", coordinate);
        return coordinate;
    }
    //choose random side lenghts
    public static int decideSize(int dimension) {
        int side = randomShape.nextInt(dimension / 2);
        //System.out.printf("Coordinate value returned is %d\n", side);
        return side;
    }
    public  void ShapeTest(){
        RandomlyGeneratedShapes panel = new RandomlyGeneratedShapes();
        JFrame app = new JFrame();
        app.add(panel);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setSize(230,250);

    }

    }
