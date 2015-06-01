package Task_1;

import java.util.Scanner;

public class Car
{
	String brand;
	int mili;
	
	public Car()
	{
		Scanner sc = new Scanner(System.in);
		brand=sc.next();
		mili = sc.nextInt();
	}
	
	public int check()
	{
		if(this.brand.equals("Audi"))
		{
			return this.mili;
		}
		return 0;
	}
	
//	@Override
//	public String toString()
//	{
//		
//	}
}
