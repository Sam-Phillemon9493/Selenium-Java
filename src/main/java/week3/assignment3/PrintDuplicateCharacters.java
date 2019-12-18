package week3.assignment3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		
		String s = "Infosys Limited";
		//Output= s,i
		char[] ch = s.toCharArray();
		//List<Character> cl = new ArrayList<>();
		Map<Character,Integer> cm = new LinkedHashMap<>();
		for (char eachChar : ch) 
		{
			if(cm.containsKey(eachChar))
			{
				cm.put(eachChar, cm.get(eachChar)+1);
			}
			else
			{
				cm.put(eachChar, 1);
			}
		}
		
		for (Entry<Character, Integer> eachEntry :cm.entrySet())
		{
			if(eachEntry.getValue()>1)
			{
				System.out.print(eachEntry.getKey()+",");
			}
		}
		
	
	}

}
