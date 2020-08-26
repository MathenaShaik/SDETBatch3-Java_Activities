package javaActivity3;

import java.util.ArrayList;

public class Activity3_1 {
   
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Orange");
		myList.add("Banana");
		myList.add("Apple");
		myList.add("Kiwi");
		
		//Add to specific index
		myList.add(2, "Guava");
		
		System.out.println("Printing all objects "+myList);
		
		System.out.println("Printing each object \n" );
		for(String x:myList) {
			System.out.println(x);
		}
		
		System.out.println("Print 3rd object " + myList.get(2));
		System.out.println("Is List contains Grapes :"+myList.contains("Grapes"));
		System.out.println("Get Size of List "+myList.size());
		
		//remove one object from list
		myList.remove("Banana");
		
		System.out.println("Printing objects after removing object - Banana \n" + myList);
		
	}
}
