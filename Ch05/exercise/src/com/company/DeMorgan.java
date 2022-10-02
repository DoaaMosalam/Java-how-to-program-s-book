package com.company;

public class DeMorgan {
    public void morgan(){
        int y = 0;
        int x = 6;

        int a = 8;
        int b =22;
        int g = 88;
// part a.
            // true        // false
        if (!(x < 5) && !( y >= 7))
            System.out.println("!( x < 5 ) && !( y >= 7 )");
        if (!((x < 5)||(y >= 7)))
            System.out.println("!((x < 5)||(y >= 7))");
// part b.
        if (!(a == b) || !(g != 5))
            System.out.println("!(a == b) || !(g != 5)");
        if (!( ( a == b ) && ( g != 5 ) ))
            System.out.println("!( ( a == b ) && ( g != 5 ) )");


// part c
        int xC = 8;
        int yC = 2;

        if ( !( ( xC <= 8 ) && ( yC > 4 ) ))
            System.out.println(" !( ( x <= 8 ) && ( y > 4 ) )");
        if ( !( x <= 8 ) || !( y > 4 ) )
             System.out.println( "!( x <= 8 ) || !( y > 4 )" );
// part d

        int i = 0;
        int j = 7;

        if ((!( ( i > 4 ) || ( j <= 6 ) )))
            System.out.println("!( ( i > 4 ) || ( j <= 6 ) )");
        if (!( ( i > 4 ) && !( j <= 6 ) ))
            System.out.println("!( ( i > 4 ) && !( j <= 6 ) )");

    }
}
