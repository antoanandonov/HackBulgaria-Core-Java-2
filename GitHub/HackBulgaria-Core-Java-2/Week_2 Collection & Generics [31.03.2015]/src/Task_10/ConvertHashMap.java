package Task_10;

import java.util.Map;

public class ConvertHashMap
{
	public static String convert(Map<?, ?> map)
	{

		StringBuilder strB = new StringBuilder();

		for (Map.Entry<?, ?> e : map.entrySet())
		{
			strB.append("Key: " + e.getKey().toString() + ", Value: " + e.getValue().toString() + "\n");
		}

		return strB.toString();
	}
}
