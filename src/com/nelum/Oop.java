package com.nelum;

public class Oop {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        User u1 = new User("Nelum Thushara", 38, "Gold");
        User u2 = new User("Manori Herath" , 36, "Platinum" );
        User u3 = new User("Thisaja Minuraka" , "Platinum" );



        System.out.println(u1.getName() + " is " + u1.getAge() + " years old and has a "+ u1.getMembership() + " membership. ");
        System.out.println(u2.getName() + " is " + u2.getAge() + " years old and has a "+ u2.getMembership() + " membership. "  );
        System.out.println(u3.getName() + " has a "+ u2.getMembership() + " membership. "  );
    }
}
