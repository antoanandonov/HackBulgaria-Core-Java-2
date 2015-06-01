package Task_1;

import java.util.ArrayList;
import java.util.List;

public class DataBase
{
	List<String> users = new ArrayList<>();

	public void add(String name)
	{
		if(!name.isEmpty() && !name.contentEquals(" "))
		{
			users.add(name);
			System.out.println("Successfully added!");
		}
		else
		{
			throw new DatabaseCorruptedException().runtimeException;
		}
	}

	@Override
	public String toString()
	{
		return String.format(users.toString());
	}
}
