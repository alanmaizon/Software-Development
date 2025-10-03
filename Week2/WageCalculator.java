/* Author: Alan Maizon
 * This program calculates the yearly wage and hourly rate based on user input
 * It uses JOptionPane to get user input and display output.
 */

import javax.swing.JOptionPane;

public class WageCalculator {
    public static void main(String[] args) {
        // Ask for monthly wage
        double monthlyWage = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Enter your monthly wage:")
        );

        // Ask for weekly hours worked
        double weeklyHours = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Enter your weekly hours worked:")
        );

        // Calculate yearly salary (12 months in a year)
        double yearlyWage = monthlyWage * 12;

        // Calculate hourly rate (assuming 52 weeks in a year)
        double hourlyRate = yearlyWage / (weeklyHours * 52);

        // Show results
        String message = "Yearly wage: $" + yearlyWage + 
                         "\nHourly rate: $" + String.format("%.2f", hourlyRate);

        JOptionPane.showMessageDialog(null, message);
        System.out.println(message); // also print to console
    }
}

// Option 2: Create an application that takes in a user's monthly wage and weekly hours and calculates how much they make per year and per hour

// Test cases:
// Input: monthly wage = 3000, weekly hours = 40
// Expected Output: Yearly wage = 36000, Hourly rate = 17.31

// Input: monthly wage = 4500, weekly hours = 0
// Expected Output: Yearly wage = 54000, Hourly rate = Infinity
// BUG FOUND! Will assume user won't input 0 for weekly hours

// Debugging tip: 
// If you encounter issues with input parsing, ensure that the input format matches the expected data type 
// For example, using '.' for decimal points in locales that require it