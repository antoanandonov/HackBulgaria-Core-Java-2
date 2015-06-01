package Task_2;

public class B extends Thread
{
	BlockQueue<Integer> b = new BlockQueue<Integer>();

	public B(BlockQueue<Integer> b)
	{
		this.b = b;
	}

	@Override
	public void run()
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("PollB: " + b.poll());
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
