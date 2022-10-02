package exercise.H;

import java.util.Scanner;

public class Varargs {
    public static int getMutilation(int...num){
        int product=1;
        for (int value: num  ) {
            product*=value;
        }
        return product;
    }
    public static void VarargsTest(){
        int num1=1;
        int num2=2;
        int num3=3;
        int num4=4;
        int num5=5;
        System.out.printf("Number 1=%d Number 2=%d,Number 3=%d,Number 4=%d,Number5=%d\n",num1,num2,num3,num4,num5);
        System.out.printf("Product number one,Number two=%d\n",getMutilation(num1,num2));
        System.out.printf("Product number one,Number two,Number three=%d\n",getMutilation(num1,num2,num3));
        System.out.printf("Product number one,Number two,Number four=%d\n",getMutilation(num1,num2,num3,num4));
        System.out.printf("Product number one,Number two,Number three,number four,Number fify=%d\n",getMutilation(num1,num2,num3,num4,num5));
    }

    public static void printA(int[]array){
        for (int counter=0;counter<array.length;counter++){
            System.out.printf("%d",array[counter]);
        }
        System.out.println("");
    }
}
