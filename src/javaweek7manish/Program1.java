package javaweek7manish;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String result;
        System.out.println("Enter any number");
        a=sc.nextInt();
        result = a % 2 == 0 ? "Even" : "odd";
        System.out.println("Number entered" + result);

    }

}
