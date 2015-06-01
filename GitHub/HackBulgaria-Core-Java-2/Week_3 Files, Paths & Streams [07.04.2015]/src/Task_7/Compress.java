package Task_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Compress
{
	private static BufferedReader reader;
	private static BufferedWriter writer;
	private static FileInputStream input;
	private static ObjectInputStream objectInput;
	private static File compress;
	private static File decompress;
	private static ObjectOutputStream objectOutput;
	private static Map<String, Integer> compressMap = new HashMap<String, Integer>();
	private static Map<String, Integer> decompressMap = new HashMap<String, Integer>();
	private static Map<Integer, String> tempMap = new HashMap<Integer, String>();
	private static Object[] tempStringArray;
	private static Object[] tempIntegerArray;
	private static String temp;
	private static String[] words;
	private static int cnt = 0;
	private static StringBuilder build = new StringBuilder();

	public static void compress(Path path)
	{
		try
		{
			reader = new BufferedReader(new FileReader(path.toFile()));

			compress = new File("compress.txt");
			if(!compress.exists())
			{
				compress.createNewFile();
			}

			while ((temp = reader.readLine()) != null)
			{
				build.append("\n");
				build.append(setHashMap(temp));
			}
			objectOutput = new ObjectOutputStream(new FileOutputStream(compress));
			objectOutput.writeObject(compressMap);
			objectOutput.close();
			writer = new BufferedWriter(new FileWriter(compress, true));
			writer.write(build.toString());
			build.setLength(0);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				writer.close();
				reader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void decompress(Path path)
	{
		try
		{
			decompress = new File("decompress.txt");
			if(!decompress.exists())
			{
				decompress.createNewFile();
			}
			input = new FileInputStream(path.toFile());
			objectInput = new ObjectInputStream(input);
			decompressMap = (HashMap<String, Integer>) objectInput.readObject();
			objectInput.close();
			input.close();

			reader = new BufferedReader(new FileReader(path.toFile()));
			tempStringArray = decompressMap.keySet().toArray();
			tempIntegerArray = decompressMap.values().toArray();
			for (int i = 0; i < decompressMap.size(); i++)
			{
				tempMap.put((Integer) tempIntegerArray[i], (String) tempStringArray[i]);
			}
			while ((temp = reader.readLine()) != null)
			{
				if(temp.indexOf("~") == 0)
				{
					temp = temp.replaceAll("~", "").trim();
					words = temp.replaceAll("[!.?']", "").split(" ");
					for (String word : words)
					{
						temp = temp.replaceFirst(word, tempMap.get(Integer.parseInt(word)));
					}
					build.append(temp);
					build.append("\n");
				}
			}
			reader.close();
			writer = new BufferedWriter(new FileWriter(decompress));
			writer.write(build.toString());
			build.setLength(0);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				objectInput.close();
				input.close();
				writer.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	private static String setHashMap(String str)
	{
		words = str.replaceAll("[.!?',]", " ").trim().split(" ");
		for (String word : words)
		{
			if(!compressMap.containsKey(word))
			{
				compressMap.put(word, cnt++);
			}
			str = str.replaceFirst(word, "~" + compressMap.get(word));
		}
		return str;
	}
}
