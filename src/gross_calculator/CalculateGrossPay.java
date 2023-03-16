package gross_calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculateGrossPay {

    public static final double HOURLY_RATE = 14.0;
    public static final double MAX_HOURS = 40.0;


    public static void main(String[] args) {
        System.out.println("Enter the no of hours you worked in this week ? ");
        Scanner sc = new Scanner(System.in);
        double workedHours = sc.nextDouble();

        while(workedHours > MAX_HOURS){
            System.out.println("You entered more than allowed hours, please enter the correct number");
            workedHours = sc.nextDouble();
        }

        System.out.println("Your gross pay is $ " + workedHours * HOURLY_RATE);

    }
}
