package Task_5;

import java.util.Collection;

public class UniqueElement
{
	public static Integer utility(Collection<Integer> collection)
	{
		Object[] array = collection.toArray();
		for (int i = 0; i < array.length; i++)
		{
			if(!hasMatch(array, i, array[i]))
			{
				return (Integer) array[i];
			}
		}

		return -1;
	}

	private static boolean hasMatch(Object[] array, int from, Object i)
	{
		for (int j = from + 1; j < array.length; j++)
		{
			if(array[j].equals(i))
			{
				return true;
			}
		}
		return false;
	}
}
