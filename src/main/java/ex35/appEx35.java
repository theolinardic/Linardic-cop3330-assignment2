/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex35;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class appEx35 {


    public static void pickWinner(ArrayList entries){
        Random randomNum = new Random();

        System.out.print("The winner is... " + entries.get(randomNum.nextInt(entries.size())));
    }

    public static void main( String[] args ) {
        ArrayList<String> entries = new ArrayList<String>();
        Scanner userInputScanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a name: ");
            String userName = userInputScanner.nextLine();
            if(userName.equals("")){
                break;
            }
            else{
                entries.add(userName);
            }
        }

        pickWinner(entries);

    }
}
