package exercise.H;

public class UsingtheEnhancedforStatement2 {
    public static double[] print(double[]x){
        for (int i = 0; i <x.length ; i++) {
            System.out.printf("%d %f",i,x[i]);
        }
        return x;
    }
    public static double sum(double[]array){
        double sum=0;
        int i=0;
        for (; i <array.length ; i++) {
            sum+=array[i];
        }
        return sum;
    }

    public static void display(){
        double[] sumArray= new double[]{63.240, 46.750,50.530,88.590,40.480,25.410,20.190};
        for (double array:sumArray) {
            System.out.printf("%.2f-",array);
        }
        //System.out.println(print(sumArray));
        System.out.println("============================================");
        System.out.println("Sum Array is: " + sum(sumArray));

    }
}
