/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex28;
import java.util.Scanner;

public class appEx28 {


    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            sum += userInputScanner.nextInt();
        }

        System.out.print("The total is " + sum +".");
    }
}
