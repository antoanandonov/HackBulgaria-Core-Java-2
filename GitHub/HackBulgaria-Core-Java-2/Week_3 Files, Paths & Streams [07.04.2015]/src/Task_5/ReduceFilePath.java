package Task_5;

public class ReduceFilePath
{

	public static String reduceFilePath(String path)
	{

		return path.replaceAll("(\\w+/[.]{2}/)|[.]{2}/", "").replaceAll("/[.]", "").replaceAll("(//+)", "/").replaceAll("^/$", "//").replaceAll("/$", "");

	}

	public static void main(String[] args)
	{
		String input = "/home//radorado/code/./hackbulgaria/week0/../";
		String input2 = "/srv/./././././";
		String input3 = "/srv/../";
		String input4 = "//////////////";
		System.out.println(reduceFilePath(input));
		System.out.println(reduceFilePath(input2));
		System.out.println(reduceFilePath(input3));
		System.out.println(reduceFilePath(input4));
	}

}
