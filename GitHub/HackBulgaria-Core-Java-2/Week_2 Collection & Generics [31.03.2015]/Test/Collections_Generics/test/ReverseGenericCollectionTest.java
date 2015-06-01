package Collections_Generics.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Task_1.ReverseGenericCollection;

public class ReverseGenericCollectionTest
{

	@Test
	public void test()
	{
		 List<Integer> collection = new ArrayList<Integer>();
		 collection.add(1);
		 collection.add(2);
		 collection.add(3);
		 collection.add(4);
	
		 ReverseGenericCollection.reverse(collection);
		 
		 assertTrue(4 == collection.get(0));
		 assertTrue(3 == collection.get(1));
		 assertTrue(2 == collection.get(2));
		 assertTrue(1 == collection.get(3));
	}

}
