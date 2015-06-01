package Task_4;

import java.util.ArrayList;

public class StackImpl implements Stack
{
	ArrayList<Object> list;

	public StackImpl()
	{
		this.list = new ArrayList<>();
	}

	@Override
	public void StackPush(Object o)
	{
		if(!list.contains(o))
		{
			list.add(o);
		}
	}

	@Override
	public Object StackPop()
	{
		if(list.size() > 0)
		{
			return list.remove(list.get(list.size() - 1));
		}
		return null;
	}

	@Override
	public Object StackPeek()
	{
		if(!list.isEmpty())
		{
			return list.get(list.size() - 1);
		}
		return null;
	}

	@Override
	public int StackSize()
	{
		return list.size();
	}
}
