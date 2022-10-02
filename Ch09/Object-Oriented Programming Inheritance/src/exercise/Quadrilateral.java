package exercise;

public abstract class   Quadrilateral extends  Point{

    // حياب مساحة متوازي الاضلاع(المستطيل) = طول القاعدة * الارتفاع
    // اي الطول * الأرتفاع
    static double height;


    public Quadrilateral(double xCoordinate, double yCoordinate) {
        super(xCoordinate, yCoordinate);

    }
//This Method calculator space Rectangle
    public static double calculatorRectangle(){
        Point point = new Point(6,0);
        height = 4;
        double space = point.getX()*height;
        return space;
    }
//This Method calculator space Square.
    public static double calculatorSquare(){
      //  Point point = new Point(5,);
        height = 5;
        double space = Math.pow(height,2);
        return space;
    }
// this method calculator space Trapezoid.
    public static double calculatorTrapezoid(){
        Point point = new Point(6,3);
        height=4;
        double space = 0.5 *(point.getX()+point.getY())*height;
        return space;
    }


}
