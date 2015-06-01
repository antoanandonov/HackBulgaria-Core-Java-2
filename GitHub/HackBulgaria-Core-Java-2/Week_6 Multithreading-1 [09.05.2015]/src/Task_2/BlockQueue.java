package Task_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BlockQueue<T> implements Queue<T>
{
	private Queue<T> queue = new LinkedList<T>();
	private int limit = 0;

	@Override
	public boolean addAll(Collection<? extends T> arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T element()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(T e)
	{
		synchronized (this.queue)
		{
			while (!queue.isEmpty())
			{
				if(limit >= 5)
				{
					try
					{
						queue.wait();
					}
					catch (InterruptedException e1)
					{
						e1.printStackTrace();
					}
				}
				limit++;
			}
			queue.notifyAll();
			queue.offer(e);
		}
		return true;
	}

	@Override
	public T poll()
	{
		synchronized (this.queue)
		{
			while (queue.isEmpty())
			{
				try
				{
					queue.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			queue.notifyAll();
		}
		return queue.poll();
	}

	public static void main(String[] args)
	{
		BlockQueue<Integer> blockQueue = new BlockQueue<Integer>();

		A t1 = new A(blockQueue);
		B t2 = new B(blockQueue);

		t1.start();
		t2.start();

	}

}
