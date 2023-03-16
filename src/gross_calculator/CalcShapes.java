package gross_calculator;

import java.util.Scanner;



public class CalcShapes {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Rectangle kitchen= getRoom();
        Rectangle bathroom = getRoom();
        System.out.println("Total areas  is "+ calculateTotalArea(kitchen, bathroom));


    }

    public static Rectangle getRoom() {
        System.out.println("Enter the length :");
        double length = sc.nextDouble();

        System.out.println("Enter the Width :");
        double width = sc.nextDouble();

        return new Rectangle(length, width);


    }

    public static double calculateTotalArea ( Rectangle rec1, Rectangle rec2){
        return rec1.calculateArea() + rec2.calculateArea();
    }




}
