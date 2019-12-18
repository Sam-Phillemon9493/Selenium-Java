package week3.assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SecMostRepeatChar {

	public static void main(String[] args) {
		
		String s = "PayPal IndiaI";
		char[] ch = s.toCharArray();
		Map<Character,Integer> cmap = new HashMap<>();
		for (char c : ch) 
		{
			if(cmap.containsKey(c))
			{
				cmap.put(c, cmap.get(c)+1);
			}
			else
			{
				cmap.put(c, 1);
			}
		}
		
		List<Integer> li = new ArrayList<>(); 
		for (Entry<Character,Integer> eachItem: cmap.entrySet()) 
		{
			li.add(eachItem.getValue());
		}
		int secMost=0,first=0;
		for (Integer eachItem: li) {
		//	System.out.println(eachItem);
			if(eachItem>first)
			{
				secMost=first;
				first = eachItem;
				
			}
			else if(eachItem>secMost && eachItem !=first)
			{
				secMost=eachItem;
			}
			
		}
		for ( Entry<Character,Integer> eachMap: cmap.entrySet()) 
		{
			if(eachMap.getValue()==secMost)
			{
				System.out.println(eachMap.getKey());
			}
		}
		
		//System.out.println(li+" "+first+" "+secMost+" ");
		
	}

}
