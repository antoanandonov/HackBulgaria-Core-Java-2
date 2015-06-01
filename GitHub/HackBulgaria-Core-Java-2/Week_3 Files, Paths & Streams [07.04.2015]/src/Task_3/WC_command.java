package Task_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class WC_command
{
	private static BufferedReader reader;
	private static char[] countCharsWords;
	public static int countLines;
	public static int countChars;
	public static int countWords;
	private static String temp;
	private static WC_command instance = null;

	public static WC_command wordCount(File file)
	{
		setLineCharWordCount(file);
		return instance;
	}

	public static WC_command wordCount(Path path)
	{
		wordCount(path.toFile());
		return instance;
	}

	private WC_command()
	{
	}

	private static void setLineCharWordCount(File file)
	{
		try
		{
			countLines = 0;
			countWords = 0;
			countChars = 0;
			reader = new BufferedReader(new FileReader(file));
			while ((temp = reader.readLine()) != null)
			{
				countLinesCharsWords(temp);
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
	}

	private static void countLinesCharsWords(String str)
	{
		int cntCh = 0;
		int cntW = 0;
		int cntL = 0;

		countCharsWords = str.toCharArray();

		for (int i = 0; i < countCharsWords.length; i++)
		{
			if(!Character.isWhitespace(countCharsWords[i]))
			{
				cntCh++;
			}
			else if(cntCh != 0)
			{
				cntW++;
			}
		}

		if(cntCh != 0)
			cntW++;

		cntL++;

		countLines = countLines + cntL;
		countWords = countWords + cntW;
		countChars = countChars + cntCh;
	}
}
