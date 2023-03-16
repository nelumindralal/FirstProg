package gross_calculator;

import java.util.Scanner;

public class TestResultUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the exam Grade : ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        String massage;
        switch (grade){
            case "A":
                massage = "above 75 points";
                break;

            case "B":
                massage = "above 65 points and below 75 points";
                break;

            case "C":
                massage = "above 55 points and below 65 points";
                break;

            case "D":
                massage = "below 55 points";
                break;

            default:
                massage ="Enter a correct grade";



        }

        System.out.println(massage);

    }
}
