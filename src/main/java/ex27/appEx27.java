/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex27;
import java.util.Scanner;

public class appEx27 {


    public static boolean firstNameValidator(String firstName){

        if(firstName.length() < 2){
            return false;
        }

        return true;
    }

    public static boolean lastNameValidator(String lastName){
        if(lastName.length() < 2){
            return false;
        }

        return true;
    }

    public static boolean zipCodeValidator(String zipCode){
        for(int i = 0; i < zipCode.length(); i++){
            if(Character.isDigit(zipCode.charAt(i)) == false){
                return false;
            }
        }

        return true;
    }

    public static boolean employeeIDValidator(String empployeeID){
        int totalDigits = 0, totalLetters = 0, totalHyphens = 0;

        for (int i = 0; i < empployeeID.length(); i++){
            if(Character.isDigit(empployeeID.charAt(i))){
                totalDigits++;
            }
            else if(Character.isLetter(empployeeID.charAt(i))){
                totalLetters++;
            }
            else if(empployeeID.charAt(i) == '-'){
                totalHyphens++;
            }
        }

        if(totalDigits == 4 && totalHyphens == 1 && totalLetters == 2){
            return true;
        }
        return false;
    }

    public static void validateInput(String firstName, String lastName, String zipCode, String employeeID){
        String outputString = "";

        if(firstNameValidator(firstName) == false){
            outputString += "The first name must be at least characters long.\n";
        }
        if(lastNameValidator(lastName) == false){
            outputString += "The last name must be at least 2 characters long.\n";
        }
        if(zipCodeValidator(zipCode) == false){
            outputString += "The zipcode must be a 5 digit number.\n";
        }
        if(employeeIDValidator(employeeID) == false){
            outputString += "The employee ID must be in the format of AA-1234.\n";
        }

        if(outputString.equals("")){
            outputString+="There were no errors found.";
        }

        System.out.print(outputString);

    }

    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = userInputScanner.next();
        System.out.print("Enter last name: ");
        String lastName = userInputScanner.next();
        System.out.print("Enter the zip code: ");
        String zipcode = userInputScanner.next();
        System.out.print("Enter the employee ID: ");
        String employeeId = userInputScanner.next();

        validateInput(firstName,lastName,zipcode,employeeId);


    }
}
