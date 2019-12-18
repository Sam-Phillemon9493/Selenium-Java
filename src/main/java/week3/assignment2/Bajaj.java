package week3.assignment2;

public class Bajaj extends Bike {
	
	public void speed(int spd)
	{
		if(spd>=0 && spd<40)
		{
			System.out.println("Least speed: Cycle");
		}
		else if(spd>=40 && spd<90)
		{
			System.out.println("Medium speed: sports bike ");
		}
		else
		{
			System.out.println("High speed: Super bike");
		}
	}

}
