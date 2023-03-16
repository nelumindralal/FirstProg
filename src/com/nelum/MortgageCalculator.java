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

        System.out.print("Principle amount in $ : ");
        principalAmount = sc.nextInt();

        System.out.print("Annual interest rate : ");
        interestRate = sc.nextFloat();

        System.out.print("Period : ");
        noOfYears = sc.nextInt();

        // print results on terminal
        String mortgageAmountFormatted = NumberFormat.getCurrencyInstance().format(mortgageCalc());
        System.out.print("Mortgage is: " + mortgageAmountFormatted);

    }

    public static double  mortgageCalc(){

        double monthlyRate = interestRate /(PERCENT*MONTHS_IN_YEAR);
        int noOfMonths = noOfYears * MONTHS_IN_YEAR;
        mortgageAmount = principalAmount * monthlyRate * Math.pow((monthlyRate + 1),
                noOfMonths)/(Math.pow((1+monthlyRate),noOfMonths) -1) ;


        return mortgageAmount;
    }

}
