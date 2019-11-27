package week1.assignments.optional;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
				String text = "madam";
				//Declare another String rev
			//	String rev = "";
				
				//Build a logic to find the given string is palindrome or not
				/*
				 * Pseudo Code
				 * a) Iterate over the String in reverse order
				 * b) Add the char into rev
				 * c) Compare text and rev, if it is same then print palindrome 
				 */
				
				boolean flag = false;
				char[] ch = text.toCharArray();
				for(int i=0;i<ch.length/2;i++)
				{
					if(ch[i]!=ch[ch.length-(i+1)])
					{
						flag = true;
						
					}
				}
				if(flag==false)
				{
					System.out.println("It is a Palindrome String!!!!!");
				}
				else
				{
					System.out.println("Not a Palindrome!!!");
				}
				
	}

}
