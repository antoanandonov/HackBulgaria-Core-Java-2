package Task_7;

public class DoublyLinkedListImplementation implements DoublyLinkedList
{
	class ListNode
	{
		ListNode previous = new ListNode();
		Integer index;
		Integer data;
		ListNode next = new ListNode();
	}

	ListNode node;

	public ListNode iterate()
	{
		ListNode temp = node;
		while (temp.next != null)
		{
			temp = temp.next;
		}
		return temp;
	}

	@Override
	public void add(Integer data)
	{
		if(node == null)
		{
			node = new ListNode();
			node.data = data;
			node.index = 0;
			node.next = null;
			node.previous = null;
		}
		ListNode toAdd = new ListNode();
		toAdd.index++;
		toAdd.data = data;
		toAdd.previous = iterate();
		iterate().next = toAdd;
	}

	@Override
	public void remove(Integer data)
	{
		if(node == null)
		{
			throw new NullPointerException("No data");
		}
		
	}

	@Override
	public int size()
	{
		return 0;
	}

	@Override
	public void get(Integer data)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void getHead(Integer data)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void getTale(Integer data)
	{
		// TODO Auto-generated method stub

	}

}
