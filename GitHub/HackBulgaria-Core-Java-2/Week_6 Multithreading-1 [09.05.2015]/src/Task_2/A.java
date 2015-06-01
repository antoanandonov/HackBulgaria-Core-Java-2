package Task_2;

public class A extends Thread
{
	BlockQueue<Integer> a = new BlockQueue<Integer>();

	public A(BlockQueue<Integer> a)
	{
		this.a = a;
	}

	@Override
	public void run()
	{
		for (int i = 1; i <= 5; i++)
		{
			a.offer(i);
			System.out.println("OfferA: " + i);
			try
			{
				A.sleep(100);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}
}
