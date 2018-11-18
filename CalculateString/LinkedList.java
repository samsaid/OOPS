// A linked list is a sequence of nodes with efficient
// element insertion and removal.
// This class contains a subset of the methods of the
// standard java.util.LinkedList class.

import java.util.NoSuchElementException;

public class LinkedList
{
	//nested class to represent a node
	private class Node
	{
		public Object data;
		public Node next;
	}

	//only instance variable that points to the first node.
	private Node first;

	// Constructs an empty linked list.
	public LinkedList()
	{
		first = null;
	}


	// Returns the first element in the linked list.
	public Object getFirst()
	{
		if (first == null)
		{
			NoSuchElementException ex
			= new NoSuchElementException();
			throw ex;
		}
		else
			return first.data;
	}

	// Removes the first element in the linked list.
	public Object removeFirst()
	{
		if (first == null)
		{
			NoSuchElementException ex = new NoSuchElementException();
			throw ex;
		}
		else
		{
			Object element = first.data;
			first = first.next;  //change the reference since it's removed.
			return element;
		}
	}

	// Adds an element to the front of the linked list.
	public void addFirst(Object element)
	{
		//create a new node
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = first;
		//change the first reference to the new node.
		first = newNode;
	}

	// Returns an iterator for iterating through this list.
	public ListIterator listIterator()
	{
		return new LinkedListIterator();
	}



	/*********************************************************
					START OF YOUR OWN METHODS
	 *********************************************************/
	//method #1
	public String toString()
	{
		//ListIterator iterator = listIterator();	
		ListIterator iterator = new LinkedListIterator();			

		String result = "{";

		while(iterator!= null && iterator.hasNext()){
			result = result + "" + iterator.next();
		}
		result = result + "}";
		return result;
	}

	//method #2
	public int size()
	{	
		//Node iterator = first;
		ListIterator iterator = new LinkedListIterator();
		int count = 0;
		while(iterator != null && iterator.hasNext())
		{
			count++;
			iterator.next();
		}
		return count;
	}

	//method #3
	public void addElement(Object element, int index){
		ListIterator iterator = new LinkedListIterator();			
		//listIterator().add(element);
		//if the position
		
		if(index < 0){
			IndexOutOfBoundsException exception = new IndexOutOfBoundsException();
			//toss it out bih
			throw exception;
		}

		else if(index == 0){
			iterator.add(element);
			return;
		}
		//try to see if u can just change to else
		else if (iterator.hasNext()){
			iterator.next();
		}
	
	}

	//method #4
	public String findSmallest(){
		ListIterator iterator = new LinkedListIterator();			
		ListIterator temp = new LinkedListIterator();
		return null;			

	//	while(iterator != null && iterator.hasNext()){
		//	temp = temp.equals(obj)
		}
		//return temp;
	//}
//}

//method #5
public void searchAndReplace(Object first, Object second){
	//Node tempNode = this.first;
	ListIterator iterator = new LinkedListIterator();
	Object temp;
	
	while(iterator != null && iterator.hasNext()){
		if (first.equals(second)) 
		{
			temp = first;
			first = second;
			second = temp;
		}
		else if (!first.equals(second))
		{
			second.equals(second);
			first.equals(first);
			}
		}
	}


//method #6
public void searchAndRemove(Object toBeRemoved){
	ListIterator iterator = new LinkedListIterator();			

	while(iterator != null && iterator.hasNext()){
		if(first.equals(toBeRemoved)){
			//Object temp = first;
			first.data = toBeRemoved;
			toBeRemoved = first.data;
		}
		else
		{
			toBeRemoved = null;
		}
	}
}




//method #7
public void reverseFirstSome(int howMany){

	Node tempFirst = null;
	Node iterator = first;

	for(int i = 0; i < (3-1); i++){
		//iterator at correct new first index
		iterator = first;
	}
	tempFirst = iterator;
	Node tempIterator =  iterator;
	for(int i = 0; i<(3-1); i++){
		tempFirst.next = tempIterator.next;
		tempFirst = tempFirst.next;
		tempIterator = tempIterator.next;

		//while loop
		while(iterator != null){
			tempFirst.next = iterator.next;
			tempFirst = tempFirst.next;
			iterator = iterator.next;
		}
	}		
}

/*********************************************************			
						END OF YOUR OWN METHODS
 *********************************************************/

//nested class to define its iterator
private class LinkedListIterator implements ListIterator
{
	private Node position; //current position
	private Node previous; //it is used for remove() method

	// Constructs an iterator that points to the front
	// of the linked list.

	public LinkedListIterator()
	{
		position = null;
		previous = null;
	}

	// Tests if there is an element after the iterator position.
	public boolean hasNext()
	{
		if (position == null) //not traversed yet
		{
			if (first != null)
				return true;
			else
				return false;
		}

		else
		{
			if (position.next != null)
				return true;
			else
				return false;
		}
	}

	// Moves the iterator past the next element, and returns
	// the traversed element's data.
	public Object next()
	{
		if (!hasNext())
		{
			NoSuchElementException ex = new NoSuchElementException();
			throw ex;
		}
		else
		{
			previous = position; // Remember for remove

			if (position == null)
				position = first;
			else
				position = position.next;

			return position.data;
		}
	}

	// Adds an element after the iterator position
	// and moves the iterator past the inserted element.
	public void add(Object element)
	{
		if (position == null) //never traversed yet
		{
			addFirst(element);
			position = first;
		}
		else
		{
			//making a new node to add
			Node newNode = new Node();
			newNode.data = element;
			newNode.next = position.next;
			//change the link to insert the new node
			position.next = newNode;
			//move the position forward to the new node
			position = newNode;
		}
		//this means that we cannot call remove() right after add()
		previous = position;
	}

	// Removes the last traversed element. This method may
	// only be called after a call to the next() method.
	public void remove()
	{
		if (previous == position)  //not after next() is called
		{
			IllegalStateException ex = new IllegalStateException();
			throw ex;
		}
		else
		{
			if (position == first)
			{
				removeFirst();
			}
			else
			{
				previous.next = position.next; //removing
			}
			//stepping back
			//this also means that remove() cannot be called twice in a row.
			position = previous;
		}
	}

	// Sets the last traversed element to a different value.
	public void set(Object element)
	{
		if (position == null)
		{
			NoSuchElementException ex = new NoSuchElementException();
			throw ex;
		}
		else
			position.data = element;
	}


} //end of LinkedListIterator class
} //end of LinkedList class