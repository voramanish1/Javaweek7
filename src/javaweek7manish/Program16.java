package javaweek7manish;

import java.util.Scanner;

public class Program16 {
    static int num;

    public static void main(String[] args) {
        numChk();
    }

    public static void enterNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check is it POSITIVE, NEGATIVE or ZERO");
        num = sc.nextInt();
    }
    public static void numChk(){
        enterNum();

        if (num > 0 ) {
            System.out.println("Number is POSITIVE");
        }else if (num < 0){
            System.out.println("NEGATIVE");
        }else{
            System.out.println("Number is ZERO");

        }
    }
}
