import java.util.*;
public class MyList<T>
{
	MyList()
	{
		
	}
	ArrayList<T> list= new ArrayList<T>();
	 ListIterator listIterator = list.listIterator();
	public void add(T element)
	{
		list.add(element);
	}
	
	public void remove(T element)
	{
		list.remove(element);
	}
	
	public void getAll()
	{
		System.out.println("Traversing ArrayList in forward direction using ListIterator");
	    while(listIterator.hasNext())
	      System.out.println(listIterator.next());
	}
	
	public void get(int i)
	{
		System.out.println(list.get(i));
	}
	
	
}