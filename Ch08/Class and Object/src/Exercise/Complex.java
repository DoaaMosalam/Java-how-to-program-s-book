package Exercise;

public class Complex {
    private static double real;
    private static double imaginary;

    Complex(double r,double imag){
        Complex.real=r;
        Complex.imaginary=imag;
    }


    public static double addComplex(double a,double b,double c,double d){
        //(a + bi)+(c + di) =
        // (a+c)+(bi + di)
       // double sum = (a+b)+(c+d);
        Complex temp = new Complex(0.0,0.0);
        temp.real = (a+c);
        temp.imaginary = (b+d);
        double sum = real+imaginary;

        return sum;
    }

    public static double multiComplex(double a, double b ,double c, double d){
        //(a+b)*(c+d) = (a+c)+(b+d)
        double multiplication = (a+b)*(c+d);
        real = (a*(c+d));
        imaginary = b*((c+d));
        multiplication = real + imaginary;

        return multiplication;

    }

    public static double subtractComplex(double a,double b,double c,double d){
        ////(a+b)-(c+d) = (a+c)-(b+d)

      //  double subtract = (a+b)-(c+d);
        real = (a-c);
        imaginary = (b-d);
        double subtract =real - imaginary;
        return subtract;
    }

    public static void resultComplex(){
        System.out.println("Sum complex Number " + addComplex(2,3,4,-3)+"i");
        System.out.println("Multiplication Complex Number " + multiComplex(-1,3,2,-5)+"i");
        System.out.printf("Subtract Complex Number %.2fi\n", subtractComplex(9.5,7.7,1.2,3.1));
        System.out.println("multiplication Complex Number " + multiComplex(9.5,7.7,1.2,3.1)+"i");



    }

//    double real, img;
//
//    //constructor to initialize the complex number
//    Complex(double r, double i){
//        this.real = r;
//        this.img = i;
//    }
//
//    public static Complex sum(Complex c1, Complex c2)
//    {
//        //creating a temporary complex number to hold the sum of two numbers
//        Complex temp = new Complex(0, 0);
//
//
//        temp.real = c1.real + c2.real;
//        temp.img = c1.img + c2.img;
//
//        //returning the output complex number
//        return temp;
//    }
//    public static void main(String args[]) {
//        Complex c1 = new Complex(5.5, 4);
//        Complex c2 = new Complex(1.2, 3.5);
//        Complex temp = sum(c1, c2);
//        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
//    }
}
