/* Author: Alan Maizon
 * This program calculates the birth year based on the user's age
 * It uses JOptionPane to get user input anfd display output.
 */

 import javax.swing.JOptionPane;

public class BirthYearCalculator {
    public static void main(String[] args) {
        // Get age from user
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));

        // Get current year from user
        int currentYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the current year"));

        // Calculate birth year
        int birthYear = currentYear - age;

        // Show result in console
        System.out.println("You were born in: " + birthYear);

        // Or optionally show it in a dialog:
        JOptionPane.showMessageDialog(null, "You were born in: " + birthYear);
    }
}