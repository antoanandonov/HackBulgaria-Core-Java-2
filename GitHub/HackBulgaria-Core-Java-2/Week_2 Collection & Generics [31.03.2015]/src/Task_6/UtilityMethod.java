package Task_6;

import java.util.Set;

public class UtilityMethod
{

	public static Set<Integer> utilityMethod(Set<Integer>... sets)
	{
		Set<Integer> set = sets[0];

		for (int i = 0; i < sets.length; i++)
		{
			set.retainAll(sets[i]);
		}
		return set;
	}
}