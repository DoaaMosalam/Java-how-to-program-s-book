package exercise.H;

import java.util.Arrays;

public class SieveofEratosthenes {
    private static boolean[] arrprimer = new boolean[1000];

    public static boolean isprimer(int x){
        return arrprimer[x];
    }

    public static void solution(){
        Arrays.fill(arrprimer,true);
        arrprimer[0]=false;
        arrprimer[1]=false;
        for (int i = 0; i <arrprimer.length ; i++) {
            if (arrprimer[i])
                for (int j = i;i* j < arrprimer.length ; j++) {
                    if (arrprimer[i*j]=false)
                        System.out.println(i);
                }
        }
        for (int i = 0; i < arrprimer.length ; i++) {
            if (isprimer(i))
                System.out.println(i);
        }
    }
}
