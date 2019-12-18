package week3.assignment2;

public abstract class Bike {
	
		public int cost(int amt)
		{
			if(amt> 50000)
			{
				System.out.println("Bike is Costly");
				return amt;
			}
			else
			{
				System.out.println("Bike is cheap");
				return amt;
			}
				
		}
		public abstract void speed(int spd);
		
}
