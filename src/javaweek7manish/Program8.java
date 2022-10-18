package javaweek7manish;

import java.util.Scanner;

public class Program8 {
    static char city;

    public static void main(String[] args) {

        getCityName();

    }

    public static void cityinitialSelection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial of city A to F || a to f to get city name:");
        city = sc.next().charAt(0);

    }

    public static void getCityName() {
        cityinitialSelection();
        if (city == 'A' || city == 'a') {
            System.out.println("Amreli");
        }else if (city == 'B' || city == 'b'){
            System.out.println("Berlin");
        }else if(city =='C'|| city =='c'){
            System.out.println("Coventry");
        }else if(city =='D'|| city == 'd'){
            System.out.println("dublin");
        }else if(city == 'E' || city == 'e'){
            System.out.println("Edison");
        }else if(city == 'F' || city == 'f'){
            System.out.println("Fresno");
        }else{
            System.out.println("Enter valid Initial of coty");

        }

        }
}