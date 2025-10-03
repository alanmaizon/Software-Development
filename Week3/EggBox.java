/* Author: A. Maizon
 * Date: 09/12/2023
 * File : EggBox.java (Instantiable class)
 * Purpose: To compute the number of egg boxes needed and leftover eggs, declaring and using variables and methods.
 * Variables [using lexical scoping: class var(DEFINE)--->local var(CALL)]: eggs, boxSize, numBoxes, leftOverEggs
 * Methods: setEggs, setBoxSize, computeBoxes, computeLeftover, getBoxes, getLeftover
 * Operations: Create an EggBox object, set the number of eggs and box size, compute the number of boxes and leftover eggs, and retrieve the results.
 * Description: EggBox central blueprint class to compute number of egg boxes and leftover eggs.
*/

//fix the code by figuring out what should be in the **** sections
public class EggBox{
	//Class variables
	 int eggs;
	 int boxSize;
	 int numBoxes;
	 int leftOverEggs;
	//Set methods
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	public void setBoxSize(int boxSize){
		this.boxSize=boxSize;
	}
	//Compute methods
	public void computeBoxes(){
		numBoxes=eggs/boxSize;
	}
	public void computeLeftover(){
		leftOverEggs=eggs%boxSize;
	}
	//Get methods
	public int getBoxes(){
		return numBoxes	;
	}
	public int getLeftover(){
		return leftOverEggs;
	}
}