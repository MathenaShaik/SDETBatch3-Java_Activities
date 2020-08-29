package javaActivity3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * 
 * @author MATHENASHAIK
 *
 */

public class Activity3_3b {
	
	public static void main(String[] args) {
	Deque<String> dq = new LinkedList<>();
	
	//Add 6animals to dq
	dq.add("Monkey");
	dq.addFirst("Jiraffe");
	dq.addLast("Zebra");
	dq.offer("Lion");
	dq.offerFirst("Elephant");
	dq.offerLast("Rabbit");
	
	Iterator<String> iterator = dq.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	//Peek Head & Tail element	
	System.out.println("Head of Queue : "+dq.peekFirst());
	System.out.println("Tail of Queue : "+dq.peekLast());
	
	
	System.out.println("After Peek : "+dq);
	
	//Search for wolf if present
	System.out.println("Contains Wolf ? "+dq.contains("Wolf"));
	
	//Remove First and Last element
	dq.removeFirst();
	dq.removeLast();
	
	//After removing
	System.out.println("List after removing : "+dq);
	System.out.println("Size of DQ after removing : "+dq.size());			
	}
}
