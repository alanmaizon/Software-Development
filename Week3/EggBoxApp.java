/* Author: A. Maizon
 * Date: 09/12/2023
 * File : EggBoxApp.java
 * Class: EggBoxApp partially taken from EggBox.java using DRY principles
 * Objects: EggBox (DECLARE--->INSTANTIATE)
 * Inputs: eggs(from JOptionPane), boxSize(hardcoded as 6)
 * Outputs (using JOptionPane.showMessageDialog): numBoxes, leftOverEggs
 * Description: EggBoxApp class to create an EggBox object, set the number of eggs and box size, compute the number of boxes and leftover eggs, and retrieve the results.
*/

//fix the code by figuring out what should be in the **** sections
import javax.swing.JOptionPane;
public class EggBoxApp{
	public static void main(String[] args) {
		//Class variables
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;
		//Object declared using reference variable
		EggBox egg; //Not instantiated yet
		egg=new EggBox(); //Constructor is created to instantiate the object
		//Inputs using JOptionPane and hardcoding
		eggs=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number of eggs"));
		boxSize=6;
		//Set methods
		egg.setEggs(eggs);
		egg.setBoxSize(boxSize);
		//Compute methods
		egg.computeBoxes();
		egg.computeLeftover();
		//Get methods
		numBoxes=egg.getBoxes();
		leftOverEggs=egg.getLeftover();
		//Outputs using JOptionPane
		JOptionPane.showMessageDialog(null,"Number of boxes needed "+numBoxes);
		JOptionPane.showMessageDialog(null,"Number of eggs left over "+leftOverEggs);
	}
}