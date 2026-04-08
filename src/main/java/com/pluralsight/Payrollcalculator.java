package com.pluralsight;

import java.util.Scanner;

public class Payrollcalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is Your ID Name? ");
        String idName = myScanner.nextLine();

        System.out.println("How Many Hours Worked?");
        double hoursWorked = myScanner.nextDouble();

        System.out.println("What is Your Pay Rate? ");
        double payRate = myScanner.nextDouble();
        double grossPay = payRate * hoursWorked;

        System.out.println("Employee ID: " + idName);
        System.out.println("Gross Pay Will be: $" + String.format("%.2f", grossPay));
    }

}
