/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex37;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class appEx37 {

    public static String GeneratePassword(int length, int totalDigits, int totalSpecial){
        ArrayList<Character> letters = new ArrayList<Character>();
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('e');
        letters.add('f');
        letters.add('g');
        letters.add('h');
        letters.add('i');
        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('m');
        letters.add('n');
        letters.add('o');
        letters.add('p');
        letters.add('q');
        letters.add('r');
        letters.add('s');
        letters.add('t');
        letters.add('u');
        letters.add('v');
        letters.add('w');
        letters.add('x');
        letters.add('y');
        letters.add('z');
        ArrayList<Character> numbers = new ArrayList<Character>();
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
        ArrayList<Character> specialChars = new ArrayList<Character>();
        specialChars.add('!');
        specialChars.add('@');
        specialChars.add('#');
        specialChars.add('$');
        specialChars.add('%');
        specialChars.add('^');
        specialChars.add('&');
        specialChars.add('*');
        specialChars.add('-');
        specialChars.add('_');
        specialChars.add('+');

        String password = "";
        Random randomNum = new Random();
        int spawnedLetters = 0, spawnedInts = 0, spawnedSpecial = 0;
        for (int i = 0; i < length; i++){
            int nextNum = randomNum.nextInt(3);
            // 0 is letter, 1 is digit, 2 is specialChar
            if(nextNum == 0){
                password += letters.get(randomNum.nextInt(letters.size()));
                spawnedLetters++;
            }
            else if(nextNum == 1){
                password+= numbers.get(randomNum.nextInt(numbers.size()));
                spawnedInts++;
            }
            else if(nextNum == 2){
                password+= specialChars.get(randomNum.nextInt(specialChars.size()));
                spawnedSpecial++;
            }

        }

        while(true){
            if(spawnedInts < totalDigits){
                password+= numbers.get(randomNum.nextInt(numbers.size()));
                spawnedInts++;
            }
            else if(spawnedSpecial < totalSpecial){
                password+= specialChars.get(randomNum.nextInt(specialChars.size()));
                spawnedSpecial++;
            }
            else if(spawnedLetters < totalSpecial+totalDigits){
                password += letters.get(randomNum.nextInt(letters.size()));
                spawnedLetters++;
            }
            else{
                break;
            }
        }

        return password;
    }

    public static void main( String[] args ) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int length = userInputScanner.nextInt();
        System.out.print("How many special characters? ");
        int specialChars = userInputScanner.nextInt();
        System.out.print("How many numbers? ");
        int digits = userInputScanner.nextInt();

        String password = GeneratePassword(length,digits,specialChars);

        System.out.print("Your password is " + password);

    }
}
