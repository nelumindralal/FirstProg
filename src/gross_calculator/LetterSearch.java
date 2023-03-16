package gross_calculator;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        System.out.print("Enter some text : ");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        boolean letterFound = false;

        // search text for letter 'A'
        for (int i = 0; i < text.length() ; i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                System.out.println("Letter is found at "+ (i+1));
                break;
            }

             
        }
        if(letterFound == false){
            System.out.println("No 'A' letter is in the text");
        }

    }
}
