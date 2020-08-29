package javaActivity3;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author MATHENASHAIK
 *
 */

public class Activity3_2 {

	public static void main(String[] args) {
	HashSet<String> names = new HashSet<String>();
	names.add("Tom");
	names.add("Mary");
	names.add("Adnan");
	names.add("Chris");
	names.add("Steve");
	names.add("Rose");
	
	System.out.println("Original Hashset: "+names);
	//Size
	System.out.println("Size of Hashset: "+names.size());
	//Remove Tom
	System.out.println("Remove Tom from Hashset : "+names.remove("Tom"));
	//Remove the one who are not present
	if(names.remove("John")) {
		System.out.println("John removed from the set");
	}else {
		System.out.println("John is not present in the set");
	}
	
	System.out.println("Checking if Steve is present : "+names.contains("Steve"));
	
	System.out.println("Updated Hashset : "+names);
	}
	
}
