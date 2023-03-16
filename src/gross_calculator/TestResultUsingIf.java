package gross_calculator;

import java.util.Scanner;

public class TestResultUsingIf {
    public static void main(String[] args){
        System.out.print("Enter the test score: ");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();

        char grade;
        if(score>= 75){
            grade = 'A';
        } else if (score >= 65) {
            grade = 'B';

        } else if (score >= 50) {
            grade = 'C';

        }else {
            grade = 'F';
        }

        System.out.println(grade);

    }
}
