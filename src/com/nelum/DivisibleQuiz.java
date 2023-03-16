package com.nelum;

import java.util.Scanner;

public class DivisibleQuiz {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if( number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else if (number % 5 == 0 ) {
            System.out.println("Fizz");
        }else{
            System.out.println(number);
        }
    }
}
