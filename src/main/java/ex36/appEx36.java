/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex36;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class appEx36 {

    public static boolean isInt(String inString){
        try{
            Integer.parseInt(inString);
            return true;
        }
        catch(Exception e){
            return false;
        }

    }

    public static double getStandardDeviation(double average, int totalNums, ArrayList<Integer> allInts){
        double standardDeviation = 0;

        for(int i = 0; i < totalNums; i++){
            standardDeviation += Math.pow(allInts.get(i) - average, 2);
        }
        standardDeviation = standardDeviation / totalNums;
        standardDeviation = Math.sqrt(standardDeviation);

        return standardDeviation;
    }

    public static void findValues(ArrayList<String> entries){
        System.out.print("Numbers: ");
        ArrayList<Integer> allInts = new ArrayList<Integer>();
        int sum = 0, totalNumbers = 0, minimum = -1, maximum = -1;
        for(int i = 0; i< entries.size(); i++){
            if(isInt(entries.get(i))){
                System.out.print(entries.get(i) + " ");
                allInts.add(Integer.parseInt(entries.get(i)));

                sum += Integer.parseInt(entries.get(i));
                totalNumbers++;
                if(minimum == -1){
                    minimum = Integer.parseInt(entries.get(i));
                    maximum = minimum;
                }
                else{
                    if(Integer.parseInt(entries.get(i)) < minimum){
                        minimum = Integer.parseInt(entries.get(i));
                    }
                    else if(Integer.parseInt(entries.get(i)) > maximum){
                        maximum = Integer.parseInt(entries.get(i));
                    }
                }
            }
        }
        double average = sum / totalNumbers;
        double standardDeviation = getStandardDeviation(average, totalNumbers, allInts);

        System.out.print("\nThe average is: " + average + "\nThe minimum is: " + minimum + "\nThe maximum is: " + maximum + "\nThe standard deviation is: " + standardDeviation);


    }

    public static void main( String[] args ) {
        ArrayList<String> responseTimes = new ArrayList<String>();
        Scanner userInputScanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number: ");
            String userInput = userInputScanner.nextLine();
            if(userInput.equals("done")){
                break;
            }
            else{
                responseTimes.add(userInput);
            }
        }

        findValues(responseTimes);

    }
}
