//Nicholas Shampoe 1215882252
//CSE 360 Monday 9:40 - 10:30
//The purpose of this assignment was to learn how to use a repository,
//in my case I started using github, hopefully you *the grader* will
//be able to read this assignment from my github repository otherwise 
//rest in peace my grade.
//The actual program is a simple adder/subtracter class that starts
//at zero and increases and decreases the value with input from the 
//(class) user and meanwhile will create a toString that will show 
//the path the number took from zero to where is it now.
package cse360assign2;

public class AddingMachine {
	
	private int total;
	private String myOutputString = "0";
/*
 * Creates a new instance of this class, "AddingMachine".
 * There is no return value.
 * When created it instantiates the variable total to be 0.
 * Doesn't have any input parameters.
 */
	public AddingMachine() {
		total = 0;
	}
/*
 * Returns a numerical integer value that is the running value of our total variable.
 * Doesn't have any input parameters.
 */
	public int getTotal() {
		return total;
	}
/*
 * There is no return value.
 * This function adds a value to our running total,
 * and updates a string for the toString function.
 * @param value   an integer value to be added to a sum that is stored
 *                within this instance of AddingMachine.
 */
	public void add(int value) {
		myOutputString += " + " + value;
		total += value;
	}
/*
 * There is no return value.
 * This function subtracts a value to our running total,
 * and updates a string for the toString function.
 * @param value   an integer value to be subtracted from a sum that is stored
 *                within this instance of AddingMachine.
 */	
	public void subtract(int value) {
		myOutputString += " - " + value;
		total -= value;
	}
/*
 * (non-Javadoc)
 * @see java.lang.Object#toString()
 */
	public String toString() {
		return myOutputString;
	}
/*
 * There is no return value.
 * This function resets our running total and our string for the toString
 * Doesn't have any input parameters.
 */
	public void clear() {
		total = 0;
		myOutputString = "0";
	}
}
