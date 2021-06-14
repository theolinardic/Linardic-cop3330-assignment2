/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex30;
import java.util.Scanner;

public class appEx30 {

    public static void printMuiltiplicationTable(){

        int currentNum = 0;

        for (int i = 1; i <= 12; i++){
            for (int x = 1; x <= 12; x++){
                currentNum = i * x;
                System.out.printf("%3d ", currentNum);
            }
            System.out.print("\n");
        }
    }

    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        printMuiltiplicationTable();



    }
}
