// Total Salary

// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//  totalSalary = basic + hra + da + allow – pf
// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.
// Round off the total salary and then print the integral part only.
import java.util.*;

public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Basic Salary");
        int basicSalary = sc.nextInt();
        System.out.println("Enter you allowance grade");
        char grade = sc.next().charAt(0);

        double hra = (basicSalary/100)*20;
        double da = (basicSalary/100)*50;
        double pf = (basicSalary/100)*11;

     
        int allowance =0;
        if(grade == 'A' || grade=='a'){
            allowance = 1700;
        }else if(grade == 'A' || grade=='a'){
            allowance = 1700;
        }else{
            allowance = 1300;
        }

         double ans = basicSalary + hra + da + allowance - pf;

         int totalSalary = (int)Math.round(ans);

        System.out.println("The total Salary is "+ totalSalary);
        
    }
}
