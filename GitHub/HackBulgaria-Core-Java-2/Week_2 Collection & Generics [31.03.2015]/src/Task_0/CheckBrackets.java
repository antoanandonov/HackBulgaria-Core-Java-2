package Task_0;

import java.util.Stack;

public class CheckBrackets
{
	String brackets = "()()())))((())(";
	Stack<Character> stack = new Stack<>();
	int cnt = 0;

	public void isCorrect(String str)
	{
		char[] arr = str.toCharArray();
		if(str.length() % 2 == 0)
		{
			if(str.startsWith("(") && str.endsWith(")"))
			{
				for (int i = 0; i < str.length(); i++)
				{
					if(arr[i] == '(')
					{
						stack.push(arr[i]);
					}
					else
					{
						stack.pop();
					}
				}
				if(stack.size() == 0)
				{
					System.out.println("Correct!");
				}
				else
				{
					System.out.println("Incorrect!");
				}
			}
		}
		else
		{
			System.out.println("Incorrect!");
		}
	}
}