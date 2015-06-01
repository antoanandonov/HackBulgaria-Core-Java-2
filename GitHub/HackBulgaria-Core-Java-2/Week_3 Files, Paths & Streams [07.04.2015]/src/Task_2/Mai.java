package Task_2;

import java.io.File;

public class Mai
{
	public static void main(String[] args)
	{
		File file = new File("Untitled.txt");
		System.out.println(Properties.parseProperties(file));
	}
}
