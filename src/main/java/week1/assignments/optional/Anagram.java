package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stsop";
				//Declare another String
				String text2 = "pots";
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
				if(text1.length()==text2.length())
				{
					char[] chAry1 = text1.toCharArray();
					Arrays.sort(chAry1);
					char[] chAry2 = text2.toCharArray();
					Arrays.sort(chAry2);
					String str1 = new String(chAry1);
					String str2 = new String(chAry2);
					if(str1.equals(str2))
					{
						System.out.println("It is an Anagram!!!");
					}
					else
					{
						System.out.println("Not An Anagram");
					}
				}
				else
				{
					System.out.println("It is not a Anagram!!");
				}
	}

}
