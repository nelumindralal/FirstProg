package com.nelum;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static int principalAmount;
    public static float interestRate;
    public static int noOfYears;
    public static double mortgageAmount;
    public static final byte MONTHS_IN_YEAR = 12;
    public static final byte PERCENT = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principle amount ($1K - $1M) in $ : ");
        principalAmount = sc.nextInt();

        while(principalAmount < 1000 || principalAmount > 10000000 ){
            System.out.print("Enter a number between 1,000 to 10,000,000");
            System.out.print("Principle amount ($1K - $1M) in $ : ");
            principalAmount = sc.nextInt();
        }

        System.out.print("Annual interest rate : ");
        interestRate = sc.nextFloat();
            while(interestRate < 0 || interestRate > 30){
                System.out.println("Enter a value greater than 0 and less than 30");
                System.out.print("Annual interest rate : ");
                interestRate = sc.nextFloat();
            }

        System.out.print("Period ( Years) : ");
        noOfYears = sc.nextInt();
            while(noOfYears <1 || noOfYears > 30){
                System.out.println("Enter a value between 1 and 30");
                System.out.print("Period ( Years) : ");
                noOfYears = sc.nextInt();
            }

        // print results on terminal
        String mortgageAmountFormatted = NumberFormat.getCurrencyInstance().format(mortgageCalc());
        System.out.print("Mortgage ( Monthly Installment) : " + mortgageAmountFormatted);

    }

    public static double  mortgageCalc(){

        double monthlyRate = interestRate /(PERCENT*MONTHS_IN_YEAR);
        int noOfMonths = noOfYears * MONTHS_IN_YEAR;
        mortgageAmount = principalAmount * monthlyRate * Math.pow((monthlyRate + 1),
                noOfMonths)/(Math.pow((1+monthlyRate),noOfMonths) -1) ;

        return mortgageAmount;
    }

}
