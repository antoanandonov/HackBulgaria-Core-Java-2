package Task_9;

import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Calc
{
	public static void main(String[] args)
	{
		Stack<Double> stack = new Stack<Double>();
		double number1;
		double number2;

		String x = JOptionPane.showInputDialog("Tokens");
		StringTokenizer str = new StringTokenizer(x);

		while (str.hasMoreElements())
		{
			str.nextElement();
			stack.push((Double) str.nextElement());

			for (int i = 0; i < x.length(); i++)
			{

				switch (x.charAt(i))
				{
					case '+':
						number1 = stack.pop();
						number2 = stack.pop();
						System.out.println(number1 + number2);
						break;
					case '-':
						number1 = stack.pop();
						number2 = stack.pop();
						System.out.println(number1 - number2);
						break;
					case '/':
						number1 = stack.pop();
						number2 = stack.pop();
						System.out.println(number1 / number2);
						break;
					case '*':
						number1 = stack.pop();
						number2 = stack.pop();
						System.out.println(number1 * number2);
						break;
				}

			}
			System.out.println(stack.pop());
		}
	}
}
