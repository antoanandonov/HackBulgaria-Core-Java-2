package Task_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Properties
{
	private static BufferedReader reader;
	private static String currentLine;
	private static int index;
	private static String temp;
	private static String key;
	private static String value;
	private static Map<String, String> map = new HashMap<String, String>();

	public static Map<String, String> parseProperties(File file)
	{
		try
		{
			reader = new BufferedReader(new FileReader(file));
			while ((currentLine = reader.readLine()) != null)
			{
				setKeyValue(currentLine);
			}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				reader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		return getMap();
	}

	private static void setKeyValue(String str)
	{
		temp = str.trim().replace(" ", "");

		if(temp.charAt(0) != '#')
		{

			index = temp.indexOf("=");
			key = temp.substring(0, index);
			value = temp.substring(index + 1, temp.length());
			setHashMap(key, value);

		}
	}

	private static void setHashMap(String key, String value)
	{
		map.put(key, value);
	}

	private static Map<String, String> getMap()
	{
		return map;
	}

}
