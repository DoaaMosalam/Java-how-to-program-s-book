package exercise.H;

public class Command_LineArguments {
    public static void main(String[] args) {
        int[]array = new int[10];
        if (args.length==1)
            array[10] = Integer.parseInt(args[0]);
            array = new int[10];
            System.out.printf( "%s%8s\n", "Index", "Value" );
// display array elements
            for ( int count = 0; count < array.length; count++ )
                System.out.printf( "%5d%8d\n", count, array[ count ] );

    }
}

