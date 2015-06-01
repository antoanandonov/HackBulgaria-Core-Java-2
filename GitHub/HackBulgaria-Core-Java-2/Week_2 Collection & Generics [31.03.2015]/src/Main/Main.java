package Main;

import java.util.HashSet;
import java.util.Set;

import Task_6.UtilityMethod;

public class Main
{

	public static void main(String[] args)
	{
		Set<Integer> collection = new HashSet<>();
		Set<Integer> collection2 = new HashSet<>();
		Set<Integer> collection3 = new HashSet<>();

		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(3);
		collection.add(4);
		collection.add(3);
		collection.add(3);
		collection.add(3);

		collection2.add(3);
		collection2.add(1);
		collection2.add(4);
		collection2.add(2);
		collection2.add(5);
		collection2.add(6);
		collection2.add(1);
		collection2.add(1);

		collection3.add(2);
		collection3.add(4);
		collection3.add(1);
		collection3.add(3);
		collection3.add(5);
		collection3.add(6);
		collection3.add(2);
		collection3.add(2);

		System.out.println(UtilityMethod.utilityMethod(collection, collection2, collection3));
	}
}
