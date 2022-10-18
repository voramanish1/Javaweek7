package javaweek7manish;

import java.util.Scanner;

public class Program3 {
    static String name,result,d,z;
    static int rollno,maths,science,english;
    static float  percentage,total;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        marks();
        marksheet();
    }
    public static void marks(){
        System.out.println("Enter student's name :");
        name = sc.nextLine();
        System.out.println("Enter student's roll no:");
        rollno=sc.nextInt();
        System.out.println("Enter given subject's marks");
        result = maths>=35 ? "Pass" : "Fail";
        result = science>=35 ? "Pass" : "Fail";
        result = english>=35 ? "Pass" : "Fail";

        System.out.print("Maths :");
        maths=sc.nextInt();
        if (maths > 100)
        {
            System.out.println("Invalid Marks");
            System.out.println("Enter Valid Marks. Marks has to be inbetween 0 to 100.");
            maths=sc.nextInt();
        }
        System.out.print("Science :");
        science=sc.nextInt();
        if (science > 100)
        {
            System.out.println("Invalid Marks");
            System.out.println("Enter Valid Mark. Marks should between 0 to 100.");
            science=sc.nextInt();
        }
        System.out.print("English :");
        english=sc.nextInt();
        if (english > 100)
        {
            System.out.println("Invalid Marks");
            System.out.println("Enter Valid Marks. Marks should between 0 to 100.");
            english=sc.nextInt();
        }


        total = (maths + science + english);
        System.out.println("Student's total is " + total);

        percentage = total / 3;
        System.out.println("Student's Percentage is " + percentage + "%");

        if (percentage >= 35)
        {
            result="Pass";
        }
        else {
            result="Fail";
        }

        result = percentage>=35 ? "Pass" : "Fail";

        if (percentage > 80)

        {
            d = "A+";
        } else if (percentage>=60 && percentage<=80) {
            d = "A";
        } else if (percentage>=50 && percentage<60) {
            d = "B";
        } else if (percentage>35 && percentage<50) {
            d = "C";
        } else {
            d = "D";
        }
        System.out.println("Grade =" +d);

    }
    public static void marksheet(){
        System.out.println("____________________");
        System.out.println("|                  |");
        System.out.println("|    Mark Sheet    |");
        System.out.println("|__________________|");
        System.out.println("|  Name   :"+name+"    |");
        System.out.println("| Roll No   :"+rollno+"    |");
        System.out.println("|__________________|");
        System.out.println("|  Subject   : Marks    |");
        System.out.println("|__________________|");
        System.out.println("| Math   :" +maths+"    |");
        System.out.println("| Science   :" +science+"    |");
        System.out.println("| English   :" +english+"    |");
        System.out.println("|__________________|");
        System.out.println("| Total   :" +total+"    |");
        System.out.println("|__________________|");
        System.out.println("| Percentage   :" +percentage+"    |");
        System.out.println("| Result   :" +result+"    |");
        System.out.println("| Grade   :" +d+"    |");
        System.out.println("|                  |");
        System.out.println("____________________");




    }
}