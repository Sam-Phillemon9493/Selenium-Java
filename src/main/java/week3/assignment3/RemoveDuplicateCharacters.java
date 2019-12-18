package week3.assignment3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		String s  = " PayPal India";
		//Output: ylIndi
		char[] charArray = s.toCharArray();
		List<Character> al = new ArrayList<>();
		for(int i=0;i<charArray.length;i++)
		{
			al.add(charArray[i]);
		}
		
		
		Map<Character, Integer> cmap = new LinkedHashMap<>();
		for (Character eachChar : al) {
			
			if(cmap.containsKey(eachChar))
			{
				cmap.put(eachChar, cmap.get(eachChar)+1);
			}
			else
			{
				cmap.put(eachChar, 1);
			}
			
		}
		//System.out.println(cmap);
		Set<Entry<Character, Integer>> entryItems = cmap.entrySet();
		List<Character> newChar = new ArrayList<>();
		for (Entry<Character, Integer> eachLetter : entryItems) {
			if(eachLetter.getValue()<2)
			{	
				
				newChar.add(eachLetter.getKey());
				
			}
			
			
		}
		for (Character ch : newChar) {
			
			System.out.print(ch);
			
		}
			
			
		
	}

}
