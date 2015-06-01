package Task_4;

public class FaultyProblem4
{
	public static boolean areEqual(Integer e, Integer k)
	{
		return e.equals(k) ? true : false;
	}

	public static boolean areEqual(float a, float b)
	{
		return Math.abs(a-b) < 0.1f ? true : false;
	}

	/**
	 * Return whether there is an index <b>i</b>, such that a[i,a.length] equals
	 * b[i, a.length];
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean haveEqualSubstrings(String a, String b)
	{
		for (int i = 0; i < a.length(); i++)
		{
			String substringA = a.substring(i, a.length());
			String substringB = b.substring(i, a.length());
			if (substringA.equals(substringB))
			{
				return true;
			}
		}
		return false;
	}
}
