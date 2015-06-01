package Main;

import Task_2.Time;

public class Main
{

	public static void main(String[] args)
	{
		Time t = new Time(12, 21, 31, 28, 03, 2015);
		System.out.println(t);
		System.out.println(Time.timeNow());

	}
}
