package main.java;

import java.io.*;
//import edu.duke.*;

public class Palindrome {

    public static void main(String[] args) {
        String fileName = "/Users/meeragajjar/Desktop/JavaTest/src/main/resources/hello_unicode.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int lines = 0;
            while (reader.readLine() != null){
                lines ++;
                System.out.println(lines);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}