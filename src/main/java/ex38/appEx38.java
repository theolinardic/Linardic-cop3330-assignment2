/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex38;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class appEx38 {

    public static ArrayList<Integer> inputToArray(String numbers){
        String currentNum = "";
        ArrayList<Integer> allNums = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length(); i++){
            if(numbers.charAt(i) == ' '){
                if(currentNum != ""){
                    allNums.add(Integer.parseInt(currentNum));
                    currentNum = "";
                }
            }
            else{
                currentNum += numbers.charAt(i);
            }

        }

        if(currentNum != ""){
            allNums.add(Integer.parseInt(currentNum));
        }


        return allNums;
    }

    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                newList.add(numbers.get(i));
            }
        }

        return newList;

    }

    public static void printArray(ArrayList<Integer> numbers){
        System.out.print("The even numbers are ");
        for (int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
        System.out.print(".");
    }

    public static void main( String[] args ) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter a list of numbers, seperated by spaces: ");
        String userPhrase = userInputScanner.nextLine();

        ArrayList<Integer> numbers = inputToArray(userPhrase);

        numbers = filterEvenNumbers(numbers);

        printArray(numbers);


    }
}
