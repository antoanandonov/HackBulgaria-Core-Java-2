package Task_4;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;

public class RotateElement
{
	private static Deque<Integer> deque = new LinkedList<Integer>();

	public static void utility(Collection<Integer> collection, int rotateStep)
	{
		deque.addAll(collection);
		collection.clear();
		while (rotateStep != 0)
		{
			if(rotateStep > 0)
			{
				deque.addFirst(deque.pollLast());
				rotateStep--;
			}
			else
			{
				deque.addLast(deque.pollFirst());
				rotateStep++;
			}
		}
		collection.addAll(deque);
		deque.clear();
		System.out.println(collection);
	}
}
