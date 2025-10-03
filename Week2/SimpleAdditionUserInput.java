/* Author: Alan Maizon
 * This program adds two numbers provided by the user 
 * It uses JOptionPane to get user input and display output.
*/

import javax.swing.JOptionPane;

public class SimpleAdditionUserInput {
    public static void main(String[] args) {

        // addition
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
        int ans = x + y;

        // print
        System.out.println(ans);

        // or optionally show it in a dialog:
        JOptionPane.showMessageDialog(null, "The sum is: " + ans);
    }
}