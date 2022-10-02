package com.company;

public class PythagoreanTriples {
    public void Pythagorean(){


        int side1;
        int side2;
        int hypotenuse;
        System.out.println("s1\ts2\thypotenuse" );
        for (side1=1;side1<=500;side1++)
            for (side2=1;side2<=500;side2++)
                for (hypotenuse=1;hypotenuse<=500;hypotenuse++)

                if ((side1 * side1) + (side2 * side2)==(hypotenuse * hypotenuse))
                    System.out.println(side1 + "\t" + side2 + "\t" + hypotenuse);

    }
}
