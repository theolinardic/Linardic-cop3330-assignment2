/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex34;

import java.util.Random;
import java.util.Scanner;

public class appEx34 {

    public static void printEmployees(String employees[]){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }

    }
    public static String[] removeEmployee(String employees[], String removePerson){

        String[] newEmployeeList = new String[employees.length-1];

        int currentPosition = 0;

        for (int i = 0; i < employees.length; i++){
            if(employees[i].equals(removePerson) == false){
                newEmployeeList[currentPosition] = employees[i];
                currentPosition++;
            }
        }


        return newEmployeeList;
    }

    public static void main( String[] args ) {
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        Scanner userInputScanner = new Scanner(System.in);
        printEmployees(employees);

        System.out.print("Enter an employee name to remove: ");
        String removePerson = userInputScanner.nextLine();

        String[] newEmployees = new String[employees.length-1];
        newEmployees = removeEmployee(employees, removePerson);

        printEmployees(newEmployees);

    }
}
