package Task_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

public class ReverseGenericCollection<T>
{

	public static <T> void reverse(Collection<T> collection)
	{
		Stack<T> stack = new Stack<>();
		for (T c : collection)
		{
			stack.push(c);
		}
		collection.clear();
		while (!stack.isEmpty())
		{
			collection.add(stack.pop());
		}
		System.out.println(Arrays.toString(collection.toArray()));
	}
}
