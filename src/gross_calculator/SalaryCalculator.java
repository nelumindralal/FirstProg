package gross_calculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){

        // initialize the know values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // get the value from the unknown
        Scanner sc = new Scanner(System.in);

        System.out.println("How many sales did the employee make this week? ");
        int sales = sc.nextInt();

        //check the condition
        if (sales >= 10) {
            salary += bonus;
        }


        //print the output
        System.out.println("the employee pay is " + salary);



    }
}
