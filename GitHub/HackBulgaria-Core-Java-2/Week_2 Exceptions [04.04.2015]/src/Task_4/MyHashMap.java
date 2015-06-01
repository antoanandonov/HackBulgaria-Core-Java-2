package Task_4;

import java.util.HashMap;

public class MyHashMap<K, V> extends HashMap<K, V>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final boolean NOT_ALLOWED = false;
	private boolean nullAllowed;

	public MyHashMap()
	{
		this(NOT_ALLOWED);
	}

	public MyHashMap(boolean nullAllowed)
	{
		this.nullAllowed = nullAllowed;
	}

	private boolean isNullAllowed()
	{
		return this.nullAllowed;
	}

	public void setNull(boolean nullAllowed)
	{
		this.nullAllowed = nullAllowed;
	}

	private void checkKey(Object key)
	{
		if(key == null && !this.isNullAllowed())
		{
			throw new NotAllowedNullException();
		}
	}

	@Override
	public V put(K key, V value)
	{
		checkKey(key);
		V object = super.put(key, value);
		return object;
	}

	@Override
	public V get(Object key)
	{
		checkKey(key);
		V object = super.get(key);
		return object;
	}
}
