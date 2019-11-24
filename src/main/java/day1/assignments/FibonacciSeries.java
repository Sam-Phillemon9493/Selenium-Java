package day1.assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Learned about Fibonacci Series and how to implement it.
	 * 2) Learned about for loop.
	 * 3) Learned that 'print' will print the result in horizontal line. 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		// Iterate from 1 to the range
			// Print first number 
			// add first and second number
			// Assign second nuumber to the first number
			// Assign sum to the second number
		
		int range=10, firstNum=0, secNum=1,thirdNum;
		for(int i=0;i<range;i++)
		{
			System.out.print(" "+firstNum);
			thirdNum = firstNum + secNum;
			firstNum=secNum;
			secNum=thirdNum;
		}
		

	}

}
