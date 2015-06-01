package Task_3;

import java.io.File;

public class Main
{

	public static void main(String[] args)
	{
		File file = new File("Untitled.txt");
		WC_command wc=WC_command.wordCount(file);
		System.out.println(wc.countLines);
		System.out.println(wc.countChars);
		System.out.println(wc.countWords);
	}

}
