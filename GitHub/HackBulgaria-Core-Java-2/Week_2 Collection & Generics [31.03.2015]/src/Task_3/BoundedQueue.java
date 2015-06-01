package Task_3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class BoundedQueue<T> implements Queue<T>
{
	Queue<T> boundedQueue;
	int limit;

	public BoundedQueue(int limit)
	{
		this.limit = limit;
		boundedQueue = new ArrayDeque<T>();
	}

	@Override
	public int size()
	{
		return boundedQueue.size();
	}

	@Override
	public boolean isEmpty()
	{
		if(boundedQueue.isEmpty())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o)
	{
		if(boundedQueue.contains(o))
		{
			return true;
		}
		return false;
	}

	@Override
	public Iterator<T> iterator()
	{
		return boundedQueue.iterator();
	}

	@Override
	public Object[] toArray()
	{
		return boundedQueue.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		return boundedQueue.toArray(a);
	}

	@Override
	public boolean remove(Object o)
	{
		if(boundedQueue.contains(o))
		{
			boundedQueue.remove(o);
			return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(boundedQueue.containsAll(c))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		if(boundedQueue.removeAll(c))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c)
	{
		if(boundedQueue.retainAll(c))
		{
			return true;
		}
		return false;
	}

	@Override
	public void clear()
	{
		boundedQueue.clear();
	}

	@Override
	public boolean addAll(Collection<? extends T> c)
	{
		return boundedQueue.addAll(c);
	}

	@Override
	public boolean add(T e)
	{
		if(isFull())
		{
			boundedQueue.poll();
			boundedQueue.add(e);
			return true;
		}

		boundedQueue.add(e);
		return true;
	}

	private boolean isFull()
	{
		return size() == limit;
	}

	@Override
	public boolean offer(T e)
	{
		return add(e);
	}

	@Override
	public T remove()
	{
		return boundedQueue.remove();
	}

	@Override
	public T poll()
	{
		return boundedQueue.poll();
	}

	@Override
	public T element()
	{
		return boundedQueue.element();
	}

	@Override
	public T peek()
	{
		return boundedQueue.peek();
	}

	@Override
	public String toString()
	{
		return Arrays.toString(boundedQueue.toArray());
	}
}
