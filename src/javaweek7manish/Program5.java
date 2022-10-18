package javaweek7manish;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program5 {
    static int eid, bsal;
    static float hra,ta, da,pf,gsal;
    static String name;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        salarySlip();
    }

    public static void empDetails(){
        System.out.println("Enter EmpName:");
        name=sc.nextLine();
        System.out.print("Enter Empld :");
                eid = sc.nextInt();
    }

    public static void salaryCalc(){
        System.out.println("Enter Employee basic salary:");
        bsal = sc.nextInt();
        hra = (bsal*10)/ 100f;
        ta = (bsal*8)/100f;
        da = (bsal*9)/100f;
        pf = (bsal*20/100f);
        gsal = (bsal + hra + ta +da) - pf;
    }

    public static void salarySlip(){
        empDetails();
        salaryCalc();
        System.out.println("|---------------------------|");
        System.out.println("|        Salary             |");
        System.out.println("|---------------------------|");
        System.out.println("|Employee id : " +eid+"     |");
        System.out.println("|Employee Name:" +name+"    |");
        System.out.println("|---------------------------|");
        System.out.println("|Basic Salary: " + bsal + "   |");
        System.out.println("|HRA 10%  : " + hra +"      |");
        System.out.println("|TA 8%  :"+ta+"             |");
        System.out.println("|DA 9%  :" +da+"            |");
        System.out.println("|PF(-20%)  : "+pf+"         |");
        System.out.println("|---------------------------|");
        System.out.println("|Gross Salary: "+gsal+"     |");
        System.out.println("|---------------------------|");

    }
}






