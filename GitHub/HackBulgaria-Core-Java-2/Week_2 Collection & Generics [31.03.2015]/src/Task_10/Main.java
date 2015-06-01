package Task_10;

import java.util.HashMap;

public class Main
{

	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Unt", 45_456_456);
		map.put("Chelsea", 95_554_455);
		map.put("City", 124_634_666);
		map.put("Arsenal", 55_754_784);
		map.put("Stoke", 32_035_846);

		String st = ConvertHashMap.convert(map);
		System.out.println(st);

	}

}
