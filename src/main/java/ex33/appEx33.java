/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex33;

import java.util.Random;
import java.util.Scanner;

public class appEx33 {

    public static void shake8Ball(){
        String[] responses = {"Yes.", "No.", "Maybe.", "Ask Again Later."};
        Random randomNum = new Random();

        System.out.print(responses[randomNum.nextInt(4)]);
    }

    public static void main( String[] args ) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("What's your question?");
        String question = userInputScanner.nextLine();

        shake8Ball();


    }
}
