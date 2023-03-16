package gross_calculator;

import java.util.Scanner;

public class ScanItems {
    public static void main(String[] args) {
        System.out.println("How many items would you like to scan? ");
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        double total = 0;

        for (int i= 0; i< quantity ; i++){
            System.out.println("Enter the cost of the item no  " + (i+1) + ": ");
            double price = sc.nextDouble();
            total += price;



        }
        System.out.println("Your total is $" + total + " for " + quantity + " Items");
    }
}
