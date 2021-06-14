/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex31;
import java.util.Scanner;

public class appEx31 {

    public static void printHeartRateTable(int age, int heartRate){
        System.out.println("Resting pulse: " + heartRate + "    Age: " + age);
        System.out.println("Intensity    | Rate");
        int targetHeartRate = 0;

        for (int intensity = 55; intensity <= 95; intensity += 5){
            targetHeartRate = (int) ((((220-age) - heartRate) * (intensity/100.0)) + heartRate);


            System.out.print(intensity +"%          | " + targetHeartRate + " bpm\n");
        }
    }

    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        int age = 0, heartRate = 0;
        System.out.print("What is your age? ");

        while(true) {
            if (userInputScanner.hasNextInt()) {
                age = userInputScanner.nextInt();
                break;
            }
            else{
                System.out.print("Please enter a valid input.\nWhat is your age? ");
                userInputScanner.next();
            }
        }

        System.out.print("What is your resting heart rate? ");

        while(true) {
            if (userInputScanner.hasNextInt()) {
                heartRate = userInputScanner.nextInt();
                break;
            }
            else{
                System.out.print("Please enter a valid input.\nWhat is your age? ");
                userInputScanner.next();
            }
        }



        heartRate = userInputScanner.nextInt();

        printHeartRateTable(age, heartRate);

    }
}
