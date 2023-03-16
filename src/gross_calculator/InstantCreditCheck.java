package gross_calculator;

import java.util.Scanner;

public class InstantCreditCheck {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Salary : ");
        double actualSalary = sc.nextDouble();

        System.out.print("Enter your credit score : ");
        double actualCreditScore = sc.nextDouble();
        sc.close();

        isUserQualified(actualSalary, actualCreditScore);
    }

    public static void isUserQualified(double salary, double creditScore ){



        double minimumSalary = 25000;
        int minCreditScore = 700;

        if( salary >= minimumSalary && creditScore >= minCreditScore){
            System.out.println("You are eligible. Congratulations! ");
        }
        else{
            System.out.println("Sorry. you are not eligible ");
        }

    }
}
