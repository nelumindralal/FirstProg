package gross_calculator;

import java.util.Scanner;

public class FillBlanks {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the current year : ");
        int year  = sc.nextInt();

        System.out.print("Number of cups drink per day : ");
        int cup  = sc.nextInt();

        System.out.print("Is it hot or cold : ");
        String weather  = sc.next();

        System.out.print("What is this Season : ");
        String season  = sc.next();

        System.out.println("on a " + weather + " "+ season+ " "+ "day, "+ "I drink minimum of "+ cup + " cups of coffee" );






    }
}
