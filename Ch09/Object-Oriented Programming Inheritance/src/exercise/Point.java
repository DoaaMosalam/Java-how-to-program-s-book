package exercise;

public class Point {
    private double x; // أ الطول
    private  double y; // ب العرض

//default constructor non-argument

    public Point(){}
    //constructor.
    public Point(double xCoordinate, double yCoordinate) {
        this.x = xCoordinate;
        this.y = yCoordinate;

    }
// setter and getter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
         return String.format( "( %.1f, %.1f )", getX(), getY() );
    }
}
