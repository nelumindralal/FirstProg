package gross_calculator;

import java.util.Random;

public class RollTheDie {

    public static void main(String[] args) {

        int noOfTries = 10;
        int sum = 0;
        int winningPoint = 20;

        for (int i = 0; i < noOfTries; i++) {
            Random rd = new Random();
            int die = rd.nextInt(6) + 1;
            sum += die;

            while (sum < winningPoint) {
                System.out.println("You've rolled a " + die + ". You are now on space " + sum + " and you have " + (winningPoint - sum) + " more to go");
                break;
            }
            if (sum == winningPoint) {
                System.out.println("You've rolled a " + die + ". You are now on space " + sum + ". Congrats, you won!");
                break;
            } else if (sum > winningPoint) {
                System.out.println("You've rolled a " + die + ". You lose!");
                break;
            }


        }


    }
}
