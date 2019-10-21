//Nicholas Shampoe 1215882252
//CSE 360 Monday 9:40 - 10:30
//The purpose of this assignment was to practice inheritance through
//a simple program that adds multiply, divide, and exponential properties
//to our AddingMachine and calling it a calculator.
package cse360assign3;

public class calculator extends AddingMachine{
	
/*
 * Creates a new instance of this class, "calculator" which gains
 * inheritance from our AddingMachine class.
 * There is no return value.
 * When created it instantiates the variable total to be 0.
 * Doesn't have any input parameters.
 */
	public calculator() {
		super();
	}
	
/*
 * There is no return value.
 * This function multiplies a value to our running total,
 * and updates a string for the toString function.
 * @param value   an integer value to be multiplied to a product
 *                that is stored within this instance of calculator.
 */
	public void mult(int value) {
		myOutputString += " * " + value;
		total *= value;
	}

/*
 * There is no return value.
 * This function divides a value to our running total,
 * and updates a string for the toString function.
 * @param value   an integer value to be divided to a quotient
 *                that is stored within this instance of calculator.
 */
	public void div(int value) {
		myOutputString += " / " + value;
		if (value != 0) {
			total /= value;
		} else {
			total = 0;
		}
	}

/*
 * There is no return value.
 * This function raises our running total to the power of value,
 * and updates a string for the toString function.
 * @param value   an integer value for our total to be raiesed to the power of
 *                that is stored within this instance of calculator.
 */
	public void power(int value) {
		myOutputString += " ^ " + value;
		if (value <= 0) {
			for (int i = 1; i < value; i++) {
				mult(value);
			}
		} else if (value == 0) {
			total = 1;
		} else {
			total = 0;
		}
		
	}
}
