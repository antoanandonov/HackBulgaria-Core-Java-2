package Task_4;

import java.io.File;
import java.nio.file.Path;

public class Main
{
	public static void main(String[] args)
	{
		File file = new File("Suits.S04E16.HDTV.x264-ASAP.srt");

		Path path = file.toPath();
		EncodingSubtitles.fixEncoding(path);
	}
}
