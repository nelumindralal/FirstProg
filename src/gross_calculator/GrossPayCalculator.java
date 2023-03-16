package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static final double HOURLY_RATE = 13;
    public static void main(String[] args){

        double hours = 0;
        double grossPay;

        // get the no of hours worked
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of hours worked : ");
        hours = sc.nextDouble();


        // multiply the hourly rate with the no of hours worked

        grossPay = HOURLY_RATE * hours;

        // display the results

        System.out.println("Gross Pay in Euros " + grossPay);
    }
}
