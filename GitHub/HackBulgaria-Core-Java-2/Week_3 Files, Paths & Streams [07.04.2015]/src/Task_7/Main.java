package Task_7;

import java.io.File;

public class Main
{

	public static void main(String[] args)
	{
		// File file = new File("jo.txt");
		// Compress.compress(file.toPath());
		File file2 = new File("compressFile.txt");
		Compress.decompress(file2.toPath());

	}

}
