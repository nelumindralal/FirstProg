package com.nelum;

import java.io.File;
import java.io.*;

public class fileReader {




        // main driver method
        public static void main(String[] args) throws Exception
        {
            // File path is passed as parameter
            File file = new File("C:\\Users\\lenovo\\Desktop\\For_YT.txt");

            // Creating an object of BufferedReader class
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Declaring a string variable
            String st;
            // Condition holds true till
            // there is character in a string
            while ((st = br.readLine()) != null)

                // Print the string
                System.out.println(st);
        }
    }
