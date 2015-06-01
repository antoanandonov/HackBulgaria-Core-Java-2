import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test
{

	// 1. Is it an odd number?
	static boolean isOdd(int n)
	{
		return n % 2 != 0;
	}

	// 2. Is N prime?
	static boolean isPrime(int n)
	{
		double maxDiv = Math.sqrt(n);
		for (int i = 2; i <= maxDiv; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	// 3. Find the minimum element of an array
	static int min(int... array)
	{
		Arrays.sort(array);
		return array[0];
	}

	// 4. Find the kth minimal element of an array
	static int kthMin(int k, int[] array)
	{
		return IntStream.of(array).sorted().toArray()[k - 1];
	}

	// 5. Find the average(средно аритметично) of the elements of an array
	static int getAverage(int[] array)
	{
		int avrg = array.length;
		int num = 0;
		for (int i = 0; i < array.length; i++)
		{
			num += array[i];
		}
		return num / avrg;
	}

	// 6. Double factorial
	static long doubleFac(int n)
	{
		long factorial = 1;
		long num = n;
		while (true)
		{
			if (num == 1)
			{
				break;
			}
			factorial *= num;
			num--;
		}
		num = factorial;
		factorial = 1;
		while (true)
		{
			if (num == 1)
			{
				break;
			}
			factorial *= num;
			num--;
		}
		return factorial;
	}

	// 7. Kth factorial
	// 100! = 100*99*98*...*1
	// 100!!=100*98*96*...*1
	// Kth - през колко се повтаря стъпката
	static long kthFac(int k, int n)
	{
		long factorial = 1;
		long num = n;
		while (true)
		{
			if (num == 1 || num <= 0)
			{
				break;
			}
			factorial *= num;
			num -= k;
		}
		return factorial;
	}

	// 8. Smallest multiple
	static long getSmallestMultiple(int upperBound)
	{
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = upperBound; i > Math.sqrt(upperBound); i--)
		{
			if (isPrime(i))
			{
				list.add(i);
			}
		}

		for (int j = 2; j <= Math.sqrt(upperBound); j++)
		{
			for (int cnt = (int) Math.sqrt(upperBound); cnt > 0; cnt--)
			{
				int b = (int) Math.pow(j, cnt);
				if (b <= upperBound)
				{
					if (!list.contains(b))
					{
						list.add(b);
						break;
					}
					break;
				}
			}
		}
		long sum = 1;
		for (Integer num : list)
		{
			sum *= num;
		}
		System.out.println(list);

		return sum;
	}

	// 9. Find the largest integer palindrome number up to N
	public static boolean isPalindrome(long num)
	{
		long[] arr = numToArr(num);
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != arr[arr.length - i - 1])
			{
				return false;
			}
		}
		return true;
	}

	private static long[] numToArr(long num)
	{
		String temp = Long.toString(num);
		long[] newGuess = new long[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			newGuess[i] = temp.charAt(i) - '0';
		}
		return newGuess;
	}

	static long getLargestPalindrome(long N)
	{
		for (long i = N; i >= 0; i--)
		{
			if (isPalindrome(i))
				return i;
		}
		return -1;
	}

	// 10. Grayscale image histogram
	// int[] histogram(short[][] image)
	{

	}

	// 11. Raise an integer to a power of another
	static double pow(double a, int b)
	{
		if (b < 0)
		{
			return pow(1 / a, -b);
		}
		else if (b == 0)
			return 1;
		else if (b == 1)
			return a;
		else if (b % 2 == 0)
		{
			return pow(a * a, b / 2);
		}
		else if (b % 2 != 0)
		{
			return a * pow(a * a, (b - 1) / 2);
		}
		else
			return b;
	}

	// 12. Find the only number, that occurs odd times in an array
	static int getOddOccurrence(int... array)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int cnt = 0, cnt2 = cnt, end, num = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = i; j < array.length; j++)
			{
				if (array[i] == array[j])
				{
					cnt++;
				}

			}
			if (cnt % 2 != 0)
			{
				list.add(array[i]);
				// num=
			}
		}
		System.out.println(list);
		return num;
	}

	// 13. Maximal scalar product
	static long maximalScalarSum(int[] a, int[] b)
	{
		long sum = 0;
		if (a.length == b.length)
		{
			Arrays.sort(a);
			Arrays.sort(b);
			for (int i = 0; i < a.length; i++)
			{
				sum += a[i] * b[i];
			}
		}
		else
		{
			System.out.println("The arrays must have the same length");
		}
		return sum;
	}

	// 14. Max span
	static int maxSpan(int[] numbers)
	{
		int start = 0;
		int end = 0;
		int max = 0;
		for (int i = 0; i < numbers.length - 1; i++)
		{
			start = i;
			for (int j = i; j < numbers.length; j++)
			{
				if (numbers[i] == numbers[j])
				{
					end = j;
				}
			}
			if (end - start + 1 > max)
			{
				max = end - start + 1;
			}
		}
		return max;
	}

	// 15. Can balance?
	// boolean canBalance(int[] numbers)
	{

	}

	// 16. Rescale an image using nearest neighbour interpolation
	// int[][] rescale(int[][] original, int newWidth, int newHeight)
	{
		// for (int i = 0; i < original.length; i++)
		// {
		// for (int j = 0; j < original.length; j++)
		// {
		//
		// if (original[i][j] < original[newWidth][newHeight])
		// {
		//
		// }
		// else
		// {
		//
		// }
		// }
		// }
	}

	// 17. Reverse a String
	static String reverseMe(String argument)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(argument);
		sb.reverse();
		return sb.toString();
	}

	// 18. Reverse each word in a String
	static String reverseEveryChar(String arg)
	{
		String[] words = arg.split("\\s");
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < words.length; i++)
		{
			builder.append(reverseMe(words[i]) + " ");
		}

		return builder.toString();
	}

	// 18. Is this string a palindrome
	static boolean isPalindrome(String argument)
	{
		char[] arr = argument.toCharArray();
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != arr[arr.length - i - 1])
			{
				return false;
			}
		}
		return true;
	}

	// 19. Is this number a palindrome
	private static int[] numToArr(int num)
	{
		String temp = Integer.toString(num);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			newGuess[i] = temp.charAt(i) - '0';
		}
		return newGuess;
	}

	static boolean isPalindrome(int argument)
	{
		int[] arr = numToArr(argument);
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != arr[arr.length - i - 1])
			{
				return false;
			}
		}
		return true;
	}

	// 18. Copy every character K times
	static String copyEveryChar(String input, int k)
	{
		char[] arr = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		int j = k;
		for (int i = 0; i < arr.length; i++)
		{
			while (k != 0)
			{
				sb.append(arr[i]);
				k--;
			}
			k = j;
		}
		return sb.toString();
	}

	// 19. Check for palindrome length around
	// int getPalindromeLength(String input)
	{

	}

	// 20. Count number of (non-overlapping) occurences
	static int countOcurrences(String needle, String haystack)
	{
		return haystack.split(needle, -1).length - 1;
	}

	// 21. Decode an URL
	static String decodeUrl(String input) throws UnsupportedEncodingException
	{
		// return input.replaceAll("%20", " ").replaceAll("%3A",
		// ":").replaceAll("%3D", "?").replaceAll("%2F", "/");
		return java.net.URLDecoder.decode(input, "UTF-8");
	}

	// 22. Sum all the numbers in a String
	static int sumOfNumbers(String input)
	{
		int sum = 0;
		for (int i = 0; i < input.length(); i++)
		{
			if (Character.isDigit(input.charAt(i)))
			{
				String current = String.valueOf(input.charAt(i));
				int j = i + 1;
				while (j <= input.length() - 1
						&& Character.isDigit(input.charAt(j)))
				{
					current += input.charAt(j);
					j++;
				}
				i = j;
				sum += Integer.parseInt(current);
			}
		}
		return sum;
	}

	// 23. Is String A an anagram of String B?
	// boolean anagram(String A, String B)
	{

	}

	// 24. Is an anagram of String A a susbstring in B?
	// boolean hasAnagramOf(A,B)
	{

	}

	// 25. Convert To Greyscale
	void convertToGreyscale(BufferedImage imgPath)
	{

		// Graphics gr = imgPath.getGraphics();
		// gr.drawImage(colorImage, 0, 0, null);
		// gr.dispose();

		for (int x = 0; x < imgPath.getWidth(); ++x)
		{
			for (int y = 0; y < imgPath.getHeight(); ++y)
			{
				int rgb = imgPath.getRGB(x, y);
				int r = (rgb >> 16) & 0xFF;
				int g = (rgb >> 8) & 0xFF;
				int b = (rgb & 0xFF);

				int grayLevel = (r + g + b) / 3;
				int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel;
				imgPath.setRGB(x, y, gray);
			}
		}
	}

	public static void main(String[] args) throws UnsupportedEncodingException
	{
		int[] a = { 1, 2, 3, 4, 1, 1 };
		int[] b = { 2, 1, 4, 5, 1, 5 };
		System.out.println(countOcurrences("da", "dadadaaaada"));
	}
}
