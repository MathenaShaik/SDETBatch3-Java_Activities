package javaActivity3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author MATHENASHAIK
 *
 */

public class Activity3_3a {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<5; i++) {
			q.add(i);
		}
		
		//print Queue values
		System.out.println("Elements in the queue : "+q);
		
		//Head remove
		int removeEle=q.remove();
		System.out.println("Removed Element : "+removeEle);
		
		//updated head of queue
		int headEle=q.peek();
		System.out.println("Head of Queue : "+headEle);
		
		int size=q.size();
		System.out.println("Size of queue "+ size);
	}

}
