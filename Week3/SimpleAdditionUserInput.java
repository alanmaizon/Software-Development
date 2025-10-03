/* Author: A. Maizon
 * Date: 09/12/2023
 * File: SimpleAdditionUserInput.java
 * Purpose: Prepare an instantiable class to perform a simple addition of two user-input numbers.
 * Variables: x, y, ans
 * Methods: setX, setY, computeAns, getAns
 * Operations: Create a SimpleAdditionUserInput object, set the two numbers, compute the sum, and retrieve the result.
 * Description: SimpleAdditionUserInput central blueprint class to perform a simple addition of two user-input numbers.
*/

public class SimpleAdditionUserInput {  
    // Declare variables
    private int x;
    private int y;
    private int ans;
    // Constructor
    public SimpleAdditionUserInput() {
        x = 0;
        y = 0;
        ans = x + y;
    }
    // Set methods with return type void
    // Scope modifier this is used to differentiate between class variable and local variable
    public void setX(int x) {
        this.x = x; 
    }
    public void setY(int y) {
        this.y = y; 
    }
    // Compute method with return type void
    public void computeAns() {
        ans = x + y;
    }
    // Get method with return type int
    public int getAns() {   
        return ans;
    }
}
