package exercise;

public class Trapezoid extends Quadrilateral{
    public Trapezoid(double xCoordinate, double yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    public static void calculator(){
        double calculator = calculatorTrapezoid();
        System.out.println(calculator);
    }
}
