package day1.assignments;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Learned about the while loop.
	 * 2) Applied the if else condition flow
	 * 3) Got to know about the Armstrong Number:)
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Declare your input
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		// Assign input into variable original 
		// Use loop to calculate: which loop to use until the number greater than 0??
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			// Check whether calculated and original are same
			//When it matches print it as Armstrong number
		
		// Sample Armstrong Number Data - 0, 1, 153, 370, 371 and 407
		int inputNum=371;
		int calc, outNum=0, orig;
		orig=inputNum;
		while(inputNum!=0)
		{
			calc=inputNum%10;
			calc=calc*calc*calc;
			inputNum=inputNum/10;
			outNum=outNum+calc;
		}
		
		if(orig==outNum)
		{
			System.out.println("The Number "+orig+" is a ArmStrogn Number!!!!!!");
		}
		else
		{
			System.out.println("Oops!!!! Not A Armstrong Number");
		}
		
	

	}

}
