package com.company;

public class Scope {
    private static int x = 1;

    public static void scope(){
        int x =5;

        System.out.printf( "local x in main is %d\n", x );
        useLocalVariable(); // useLocalVariable has local x
        useField(); // useField uses class Scope's field x
        useLocalVariable(); // useLocalVariable reinitializes l
        useField(); // class Scope's field x retains its value
        System.out.printf( "\nlocal x in main is %d\n", x );
    }

    public static void useLocalVariable(){
        int x = 25;
        System.out.printf(
                "\nlocal x on entering method useLocalVariable is %d\n", x );

        ++x; // modifies this method's local variable x

        System.out.printf(
                "local x before exiting method useLocalVariable is %d\n", x++ );
    }

    public static void useField(){
        System.out.printf(
                "\nfield x on entering method useField is %d\n", x );

        x *= 10; // modifies class Scope's field x
        System.out.printf("field x before exiting method useField is %d\n", x );

    }
}
