package Task_6;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
	public static void main(String[] args)
	{
		Path path = Paths.get("/Macintosh HD/Users/antoanandonov/Desktop");
		FindBrokenLink.findBadLink(path);
	}
}
