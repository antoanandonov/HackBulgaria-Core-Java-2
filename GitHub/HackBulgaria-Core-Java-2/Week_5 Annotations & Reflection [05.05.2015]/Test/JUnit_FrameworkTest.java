import org.junit.Before;
import org.junit.Test;

import Task_2.JUnit_Framework;
import static org.junit.Assert.*;

public class JUnit_FrameworkTest
{
	JUnit_Framework framework;

	@Before
	public void init()
	{
		framework = new JUnit_Framework();
	}

	@Test
	public void testAdd()
	{
		int x = 10;
		int y = 20;
		assertEquals(30, framework.add(x, y));
	}

	@Test
	public void TestSub()
	{
		int x = 10;
		int y = 20;
		assertEquals(-10, framework.sub(x, y));
	}
}
