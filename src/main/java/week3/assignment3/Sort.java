package week3.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sort {

	public static void main(String[] args) {
		
		List<String> ab = new ArrayList<>();
		ab.add("HCL");
		ab.add("Aspire Systems");
		ab.add("CTS");
		ab.add("Zenit");
		ab.add("TCS");
		ab.add("Amazon");
		ab.add("Google");
		ab.add("CTS");
		Collections.sort(ab);
		Collections.reverse(ab);
		for(int i=0;i<ab.size();i++)
		{
				System.out.println(ab.get(i));
		}

		

	}

}
