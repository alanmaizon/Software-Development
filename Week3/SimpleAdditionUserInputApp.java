/* Author: A. Maizon
 * Date: 09/12/2023
 * File: SimpleAdditionUserInputApp.java
 * Class: SimpleAdditionUserInputApp using methods and operations following DRY principles
 * Objects: SimpleAdditionUserInput (DECLARE--->INSTANTIATE)
 * Inputs (using JOptionPane.showInputDialog): x, y
 * Outputs (using JOptionPane.showMessageDialog): ans
 * Description: SimpleAdditionUserInputApp class to create a SimpleAdditionUserInput object, set the two numbers, compute the sum, and retrieve the result.
*/

import javax.swing.JOptionPane;

public class SimpleAdditionUserInputApp {  
    public static void main(String[] args) {
        // Declare variables
        int x;
        int y;
        int ans;
        // Object declared using reference variable
        SimpleAdditionUserInput add;
        add = new SimpleAdditionUserInput();
        // Inputs using JOptionPane
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number"));
        // Set methods
        add.setX(x);
        add.setY(y);
        // Compute method with return type void
        add.computeAns();
        // Get method with return type int
        ans = add.getAns();
        // Output using JOptionPane
        JOptionPane.showMessageDialog(null, "The sum is: " + ans);
    }
}