/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex32;
import java.util.Scanner;
import java.util.Random;

public class appEx32 {

    public static void playGame(){
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter the difficulty level (1,2,3): ");

        int difficultyLevel = userInputScanner.nextInt();
        int randomNumber = 0, guess, totalGuesses = 0;
        Random randomNum = new Random();

        if(difficultyLevel == 1){
            randomNumber = randomNum.nextInt(10);
        }
        if(difficultyLevel == 2){
            randomNumber = randomNum.nextInt(100);
        }
        if(difficultyLevel == 3){
            randomNumber = randomNum.nextInt(1000);
        }
        System.out.print("I have my number. What's your guess? ");
        while(true){

            while(true) {
                if (userInputScanner.hasNextInt()) {
                    guess = userInputScanner.nextInt();
                    totalGuesses++;
                    break;
                }
                else{
                    System.out.print("Please enter a valid input.\nWhat's your guess? ");
                    totalGuesses++;
                    userInputScanner.next();
                }
            }

            if(guess < randomNumber){
                System.out.print("Too Low. What's your guess? ");
            }
            if(guess > randomNumber){
                System.out.print("Too High. What's your guess? ");
            }
            if(guess == randomNumber){
                System.out.print("You got it in " + totalGuesses + " guesses!");
                break;
            }


        }
    }

    public static void main( String[] args )
    {
        System.out.println("Let's play guess the number!\n");

        playGame();
        while(true){
            System.out.print("\n\nWould you like to play again (y/n)? ");
            Scanner userInputScanner = new Scanner(System.in);
            String userPlayAgain = userInputScanner.next();

            if(userPlayAgain.equals("y") || userPlayAgain.equals("Y")){
                playGame();
            }
            else{
                break;
            }
        }

    }
}
