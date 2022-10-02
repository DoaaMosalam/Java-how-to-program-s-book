package com.company;

public class StudentPoll {
    public static void poll(){
        int [] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
                2, 3, 3, 2, 14};

        int[] frequency = new int[6];
        // for each answer, select responses element and use that value
// as frequency index to determine element to increment

        for (int answer=0;answer<responses.length;answer++){
            try {
                ++frequency[responses[answer]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("responses[%d]=%d\n\n",answer,responses[answer]);
            }
        }
        System.out.printf( "%s%10s\n", "Rating", "Frequency" );
        for (int rate =1;rate<=frequency.length;rate++){
            System.out.printf("%6d%10d\n",rate ,frequency[rate]);
        }
    }
}
