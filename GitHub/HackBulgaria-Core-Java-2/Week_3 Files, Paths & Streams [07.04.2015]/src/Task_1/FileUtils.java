package Task_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils
{
	static BufferedReader br;
	static String current;
	static StringBuilder sb = new StringBuilder();
	public static FileUtils instance = null;

	public static FileUtils getInstance()
	{
		return instance;
	}

	private FileUtils()
	{
	}

	static String readFrom(File file) throws IOException
	{
		if(file.exists())
		{
			br = new BufferedReader(new FileReader(file));
			while ((current = br.readLine()) != null)
			{
				sb.append(current);
				sb.append("\n");
			}
			return sb.toString();
		}
		throw new FileNotFoundException();
	}

	static String readFrom(Path path) throws IOException
	{
		return readFrom(path.toFile());
	}

	public static void main(String[] args)
	{
		String test = "";
		try
		{
			 File file = new File("Untitled.txt");
			test = FileUtils.readFrom(Paths.get("Untitled.txt"));

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(test);

	}

}
