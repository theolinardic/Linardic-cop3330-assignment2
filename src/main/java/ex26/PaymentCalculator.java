/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex26;

import java.util.Scanner;

public class PaymentCalculator {

    public static int calculateMonthsUntilPaidOff(double balance, double aprPercent, double monthlyPayment){

        double months = (-(1.0/30.0)) * Math.log(1 + (balance/monthlyPayment) * (1 - Math.pow((1 + aprPercent), 30))) / Math.log(1 + aprPercent);
        int intMonths = (int) Math.ceil(months);
        return intMonths;
    }

    public static void main( String[] args ){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = userInputScanner.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double aprPercent = userInputScanner.nextDouble();
        aprPercent = aprPercent/100;
        aprPercent = aprPercent / 365;
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = userInputScanner.nextDouble();

        int monthsUntilPayoff = calculateMonthsUntilPaidOff(balance,aprPercent,monthlyPayment);

        System.out.print("It will take you " + monthsUntilPayoff + " months to pay off this card.");
    }

}
