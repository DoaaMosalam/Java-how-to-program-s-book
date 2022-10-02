package com.company;

import java.util.ArrayList;

public class ArrayListCollection {
    public void collection(){
        // create a new ArrayList of Strings with an initial capacity of 10
        ArrayList< String > items = new ArrayList< String >();
        items.add( "red" ); // append an item to the list
        items.add( 0, "yellow" ); // insert the value at index 0
        System.out.println("colours index of in arraylist is: " + items.indexOf("red"));
// header
        System.out.print(
                "Display list contents with counter-controlled loop:" );
// display the colors in the list
        for ( int i = 0; i < items.size(); i++ )
            System.out.printf( " %s", items.get( i ) );
// display colors using foreach in the display method
        display( items,
                "\nDisplay list contents with enhanced for statement:" );
        items.add( "green" ); // add "green" to the end of the list
        items.add( "yellow" ); // add "yellow" to the end of the list
        display( items, "List with two new elements:" );
        items.remove( "yellow" ); // remove the first "yellow"
        display( items, "Remove first instance of yellow:" );
        items.remove( 1 ); // remove item at index 1
        display( items, "Remove second list element (green):" );
// check if a value is in the List
        System.out.printf( "\"red\" is %sin the list\n",
                items.contains( "red" ) ? "": "not " );
// display number of elements in the List
        System.out.printf( "Size: %s\n", items.size() );

    }

    public static void display(ArrayList<String>item,String description){
        System.out.println(description);
        for (String values:item) {

            System.out.printf(" %s",values);
        }
        System.out.println();

    }
}
