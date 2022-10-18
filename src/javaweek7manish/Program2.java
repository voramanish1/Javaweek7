package javaweek7manish;

import java.util.Scanner;

public class Program2 {
    static int a;

    public static void main(String[] args) {
        royalfamily();

    }

    public static void royalfamily() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.println("Is a leap Year");
        } else if (a % 400 == 0) {
            System.out.println("is a leap Year");
        } else {
            System.out.println("is not a Leap Year");

        }

    }
}
