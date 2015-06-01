package Task_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentsList
{

	private static void sortByNames(List<Students> students)
	{

		Collections.sort(students, new Comparator<Students>()
		{

			@Override
			public int compare(Students o1, Students o2)
			{
				return o1.getName().compareTo(o2.getName());
			}
		});

	}

	public static void sortByGrade(List<Students> students)
	{
		sortByNames(students);

		Collections.sort(students, new Comparator<Students>()
		{

			@Override
			public int compare(Students o1, Students o2)
			{
				Integer a = o1.getGrade();
				Integer b = o2.getGrade();
				return b.compareTo(a);
			}
		});

	}
}
