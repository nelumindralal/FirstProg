package gross_calculator;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
    greetUser();
    }

    public static void greetUser(){
        System.out.print("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Hello! " + name +" Welcome to Germany" );
    }
}
