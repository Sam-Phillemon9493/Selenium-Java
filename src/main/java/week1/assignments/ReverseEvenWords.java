package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		String[] strArray = test.split(" ");
		
		for(int i=0;i<strArray.length;i++)
		{
			if(i%2==1)
			{
				char[] charArray = strArray[i].toCharArray();
				int k=0;
				char[] tmpVar = new char[charArray.length];
							
				for(int j=charArray.length-1;j>=0;j--)
				{
					tmpVar[k]=charArray[j];
					k++;
					
				}
			strArray[i]=String.valueOf(tmpVar);
				
			}
			System.out.print(strArray[i]+" ");
		}
		

	}

}
