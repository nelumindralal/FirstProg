package gross_calculator;

import java.util.Scanner;

public class InstantCreditCheck2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Salary : ");
        double actualSalary = sc.nextDouble();

        System.out.print("Enter your credit score : ");
        double actualCreditScore = sc.nextDouble();
        sc.close();

        boolean qualified = isUserQualified(actualSalary, actualCreditScore);
        notifyUser(qualified);
    }

    public static boolean isUserQualified(double salary, double creditScore ){



        double minimumSalary = 25000;
        int minCreditScore = 700;

        if( salary >= minimumSalary && creditScore >= minCreditScore){
            return true;
        }
        else{
            return false;
        }

    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("You are approved!");
        }
        else{
            System.out.println("You are declined!");
        }
    }

}
