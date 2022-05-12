package com.chainsys.collections;
import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> arraydeque= new ArrayDeque<String>();
//		use an ArrayDeque like a Stack.
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");//DUPLICATE VALUE
		arraydeque.push("Z");//DUPLICATE VALUE
		arraydeque.push("E");
		arraydeque.push("F");

//		System.out.println("Before Popping the stack : "+arraydeque.size());
//		while(arraydeque.peek()!=null)
//		
//			System.out.println(arraydeque.pop()+" ");
//		
//		System.out.println("After popping the stack : "+arraydeque.size());

		Iterator<String> iterator=arraydeque.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println("\t"+iterator.next()+" ");
//		}
//		
//		System.out.println("Descending Iterator : ");
//		Iterator<String> striterator=arraydeque.descendingIterator();
//		while(striterator.hasNext())
//		{
//			System.out.println("\t"+striterator.next());
//		}
//		
		
		arraydeque.addFirst("H");
		arraydeque.addLast("I");
		iterator =arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t"+iterator.next());
		}
		
		
		//-----
		//pollfirst-
		//Retrieves and remove the first element of this deque or
		//returns null if this deque is empty
		System.out.println("**********************PollFirst : "+arraydeque.pollFirst());
		System.out.println(arraydeque);
		System.out.println("**********************PollLast : "+arraydeque.pollLast());
		System.out.println(arraydeque);
		
		
		//-----
				//peekfirst-
				//Retrieves but does not remove the first element of this deque or
				//returns null if this deque is empty
				System.out.println("**********************PeekFirst : "+arraydeque.peekFirst());
				System.out.println(arraydeque);
				System.out.println("**********************PeekLast : "+arraydeque.peekLast());
				System.out.println(arraydeque);
				
		//-----
				//removefirst-
				//Retrieves and remove the first element of this deque 
				//this method is differs from pollfirst only in that it throws an exception
				//if this deque is empty
				System.out.println("**********************removeFirst : "+arraydeque.removeFirst());
				System.out.println(arraydeque);
				System.out.println("**********************removelast : "+arraydeque.removeLast());
				System.out.println(arraydeque);
				
				
//				System.out.println("**********************removeFirstOccurance: X "+arraydeque.removeFirstOccurance());
				System.out.println(arraydeque);
//				System.out.println("**********************removelastOccurance : "+arraydeque.removeLastOccurance());
				System.out.println(arraydeque);

	}
	
	

}
