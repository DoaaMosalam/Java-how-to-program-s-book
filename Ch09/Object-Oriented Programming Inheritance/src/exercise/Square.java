package exercise;

public class Square extends Quadrilateral {

    public Square(double xCoordinate, double yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    public static void calculator(){
        double space = calculatorSquare();
        System.out.println(space);
    }
}
