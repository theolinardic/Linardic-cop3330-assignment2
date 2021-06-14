/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex25;
import java.util.Scanner;

public class appEx25 {

    public static int passwordValidator(String password){
        int totalLetters = 0, totalNumbers = 0, totalSpecialChars = 0;

        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                totalNumbers++;
            }
            else if(Character.isLetter(password.charAt(i))){
                totalLetters++;
            }
            else{
                totalSpecialChars++;
            }
        }

        if(totalNumbers == password.length() && password.length() < 8){
            return 0;
        }
        else if(totalLetters == password.length() && password.length() < 8){
            return 1;
        }
        else if(totalLetters > 0 && totalNumbers > 0 && totalSpecialChars > 0 && password.length() >= 8){
            return 3;
        }
        else if(totalLetters > 0 && totalNumbers > 0 && password.length() >= 8){
            return 2;
        }


        return 0;
    }


    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter a passsword: ");
        String password = userInputScanner.next();
        int passwordStrength = passwordValidator(password);

        System.out.print("The password \'" + password + "\' is a ");

        if(passwordStrength == 0){
            System.out.print("very weak password.");
        }
        else if(passwordStrength == 1){
            System.out.print("weak password.");
        }
        else if(passwordStrength == 2){
            System.out.print("strong password.");
        }
        else{
            System.out.print("very strong password.");
        }

    }
}
