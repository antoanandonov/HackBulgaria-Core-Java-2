package Task_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class OnOff<T> implements Collection<T>
{
	private List<T> collection = new ArrayList<T>();

	@Override
	public int size()
	{
		return collection.size();
	}

	@Override
	public boolean isEmpty()
	{
		return collection.isEmpty();
	}

	@Override
	public boolean contains(Object o)
	{
		return collection.contains(o);
	}

	@Override
	public Iterator<T> iterator()
	{
		return collection.iterator();
	}

	@Override
	public Object[] toArray()
	{
		return collection.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		return collection.toArray(a);
	}

	@Override
	public boolean add(T e)
	{
		if(collection.contains(e))
		{
			for (int i = 0; i < collection.size(); i++)
			{
				if(collection.get(i) == e)
				{
					collection.remove(i);
					return false;
				}
			}
		}
		collection.add(e);
		return true;
	}

	@Override
	public boolean remove(Object o)
	{
		return collection.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		return collection.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends T> c)
	{
		return collection.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		return collection.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c)
	{
		return collection.retainAll(c);
	}

	@Override
	public void clear()
	{
		collection.clear();
	}

}
