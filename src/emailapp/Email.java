package emailapp;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private int mailboxCapacity;
   private String alternateEmail;

    // constructor to receive the first name and last name
    public Email(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email is created for " + this.firstName +" "+ this.lastName);

        // call a method asking for the department and return the department
        this.department = setDepartment();
        System.out.println(this.firstName +" "+ this.lastName + " is assigned to " + this.department + " department");
    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if(depChoice == 1){return "Sales";}
        else if(depChoice == 2){return "Development";}
        else if (depChoice == 3) {return "Accounting";}
        else return "none";


    }


    // Generate a random password

    // set the mailbox capacity

    // set the alternate email

    // Change the password

}
