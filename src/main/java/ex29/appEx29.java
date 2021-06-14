/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex29;
import java.util.Scanner;

public class appEx29 {


    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What is the rate of return? ");
        int rateOfReturn = 0;
        while(true){
            if(userInputScanner.hasNextInt()){
                rateOfReturn = userInputScanner.nextInt();

                if(rateOfReturn != 0){
                    break;
                }
                else{
                    System.out.print("Please enter valid input.\nWhat is the rate of return? ");
                }


            }
            else{
                System.out.print("Please enter valid input.\nWhat is the rate of return? ");
                userInputScanner.next();
            }
        }

        int years = 72 / rateOfReturn;

        System.out.print("It will take " + years + " years to double your initial investment.");


    }
}
