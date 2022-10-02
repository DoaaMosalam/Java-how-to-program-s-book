package Exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntegerSet {
    private  static int sizeSet= 101;
    private static boolean[] set = new boolean[sizeSet];

    public IntegerSet(){
        for(boolean b : set)
            b = false;
    }

    IntegerSet(int... num){
        for (int n:num) {
            insertElement(n);
        }
    }


    public static boolean isSet(int[]x,int counter,int value){
        boolean set = false;
        for (int i = 0; i <counter ; i++) {
            if (x[i]==value)
                set=true;
        }
        return set;
    }

    public static boolean isEqual(int[]set1,int[]set2){
        boolean equal =true;
        for (int i = 0; i <set1.length ; i++) {
            if (set1[i]!= set2[i])
                equal=false;
        }
        return equal;
    }

    public static void insertElement(int k){
        if (k < sizeSet)
            set[k]=true;
        else
            throw new ArrayIndexOutOfBoundsException("element range between 0-100");
    }

    public static void deleteElement(int m){
        if (m < sizeSet)
            set[m]=false;
        else throw new ArrayIndexOutOfBoundsException("element range between 0-100");
    }

    public static int[] union (int[]... set){
        int maxSize = 0;
        int counter = 0;

        for (int[] array : set)
            maxSize += array.length;
        int[] temp = new int[maxSize];

        for (int[] array : set)
            for (int i : array)
                if (!isSet(temp, counter, i))
                    temp[counter++] = i;

        int[] result = new int[counter];
        for (int i = 0; i < counter; i++)
            result[i] = temp[i];

        return result;
    }

    public static Integer[] unionSet(Integer[]set1, Integer[]set2){
        Set<Integer> list = new HashSet();
        list.addAll(Arrays.asList(set1));
        list.addAll(Arrays.asList(set2));
        //Convert to Array
        Integer[] union = {};
        union = list.toArray(union);
        return union;
    }

    public static void intersection(Integer[]set1, Integer[]set2){
        Set<Integer> intersection = new HashSet<>();
        intersection.addAll(Arrays.asList(set1));
        Set<Integer> intersection2 = new HashSet<>();
        intersection2.addAll(Arrays.asList(set2));
        intersection.retainAll(intersection2);
        System.out.println(intersection);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<sizeSet; i++){
            if(set[i] == true)
                sb.append(" " + i);
        }
        return (sb.toString().equals("")) ? "---" : sb.toString();
    }

    public static void display() {
//        IntegerSet intSet1 = new IntegerSet(1, 99, 88, 77, 56, 75, 46, 98, 100);
//        IntegerSet intSet2 = new IntegerSet(13, 9, 56, 29, 75, 56, 46, 1, 100);

        int[] intSetone = {1, 99, 88, 77, 56, 75, 46, 98, 100};
        int[] intsetTwo = {13, 9, 56, 29, 75, 56, 46, 1, 100};

        System.out.println("IntegerSet number one is: " + Arrays.toString(intSetone));
        System.out.println("IntegerSet number two is:  " + Arrays.toString(intsetTwo));
        System.out.println("==================================================");
         System.out.println(Arrays.toString(union(intSetone,intsetTwo)));
        System.out.println("=====================================================");
        Integer[] unionSetOne = {1, 99, 88, 77, 56, 75, 46, 98, 100};
        Integer[] unionSetTwo = {13, 9, 56, 29, 75, 56, 46, 1, 100};
        System.out.println("Union Two Array about HashSet: " + Arrays.toString(unionSet(unionSetOne,unionSetTwo)));
        System.out.println("=====================================================================================");
//        System.out.println(intersection(unionSetOne,unionSetTwo));
        intersection(unionSetOne,unionSetTwo);
    }
}
