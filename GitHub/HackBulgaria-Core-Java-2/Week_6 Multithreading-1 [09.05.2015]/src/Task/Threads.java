package Task;

import java.util.concurrent.atomic.AtomicInteger;

public class Threads implements Runnable
{
	private static AtomicInteger counter;
	private static int cnt = 0;
	private Thread T1;
	private Thread T2;

	public Threads()
	{
		this.T1 = new Thread();
		this.T2 = new Thread();
	}

	@Override
	public void run()
	{
		try
		{
			counter.incrementAndGet();
			T1.start();
			T1.join();
			
			counter.decrementAndGet();
			T2.start();
			T2.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("counter " + counter.get());
		System.out.println("cnt " + cnt);

	}

	public static void main(String[] args)
	{

		int cnt=0;
		for (int i = 0; i < 200; i++)
		{
			cnt++;
		}
		new Threads().T1.start();
		new Threads().T2.start();
	}
}
