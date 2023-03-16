package gross_calculator;

import java.util.Scanner;

public class DollarGame {
    public static final int PENNY = 1;
    public static final int NICKEL = 5;
    public static final int DIME = 10;
    public static final int QUARTER = 25;
    public static final double dollar = 1.00;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of pennies : ");
        double pennieCount = sc.nextDouble();

        System.out.print("Enter no of nickels : ");
        double nickelCount = sc.nextDouble();

        System.out.print("Enter no of dimes : ");
        double dimeCount = sc.nextDouble();

        System.out.print("Enter no of quarters : ");
        double quarterCount = sc.nextDouble();

        double sum = (pennieCount * PENNY + nickelCount * NICKEL + dimeCount * DIME + quarterCount * QUARTER) / 100;
        double balance = sum - dollar;
        if (sum > dollar) {
            System.out.println("Sorry, you are over "+  balance);
        }
        else if(sum < dollar) {
            System.out.println("Sorry, you are short "+  balance);
        }
        else System.out.println("Yes, you won!");




    }
}
