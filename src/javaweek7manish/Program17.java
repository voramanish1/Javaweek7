package javaweek7manish;

import java.util.Arrays;
import java.util.Scanner;

public class Program17 {
    static int ar1;
    static String ar2;

    public static void main(String[] args) {
        array();
    }

    public static void array(){
        int[] ar1 = {4,2,6,9,5,8,3,1,7,};
        String[] ar2 = {"XYZ", "MNO", "ABC", "PQR", "HIJ", "STU"};

        System.out.println("Displayed number array: " + Arrays.toString(ar1));
        Arrays.sort(ar1);
        System.out.println("Sorted number array: " + Arrays.toString(ar1));

        System.out.println("Displayed string array: " + Arrays.toString(ar2));
        Arrays.sort(ar2);
        System.out.println("Sorted string array: " + Arrays.toString(ar2));
    }
}


