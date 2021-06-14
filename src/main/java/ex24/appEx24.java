/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex24;
import java.util.Scanner;

public class appEx24 {

    public static boolean isAnagram(String word1, String word2){
        int word1Length = word1.length();
        int word2Length = word2.length();

        if(word1Length != word2Length){
            return false;
        }

        for(int i = 0; i<word1Length; i++){
            if(word2.indexOf(word1.charAt(i)) == -1){
                return false;
            }
        }

        return true;
    }


    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String userWord1 = userInputScanner.next();
        System.out.print("Enter the second string: ");
        String userWord2 = userInputScanner.next();
        boolean areWordsAnagrams = isAnagram(userWord1, userWord2);

        if(areWordsAnagrams){
            System.out.print("\"" + userWord1 + "\" and \"" + userWord2 + "\" are anagrams.");
        }
        else{
            System.out.print("\"" + userWord1 + "\" and \"" + userWord2 + "\" are not anagrams.");
        }
    }
}
