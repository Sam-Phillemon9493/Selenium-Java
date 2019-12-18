package week3.assignment3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DistinctChar {

	public static void main(String[] args) {
		
		String s = " Amazon India Private Limited";
		char[] ch = s.toCharArray();
		List<Character> disChar = new ArrayList<>();
		for (char c : ch) {
			
			disChar.add(c);
			
		}
		Set<Character> disChar1 = new LinkedHashSet<>(disChar);
		for (Character eachChar : disChar1) {
			System.out.print(eachChar);
		}
		
	}

}
