package Task_3;

public class Pair
{
	private Object key;
	private Object value;

	public Pair()
	{
		this.key = new Object();
		this.value = new Object();
	}

	public Object getKey()
	{
		return this.key;
	}

	public Object getValue()
	{
		return this.value;
	}

	@Override
	public boolean equals(Object other)
	{
		if(other instanceof Pair)
		{
			Pair pairToCompare = (Pair) other;
			if(this.key == pairToCompare.key && this.value == pairToCompare.value)
			{
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public String toString()
	{
		return String.format("Тhe key is: " + this.key, "The value is: " + this.value);
	}
}
