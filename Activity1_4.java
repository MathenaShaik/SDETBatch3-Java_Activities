package javaActivity1;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {	    
	 
		int[] Card = {12,15,13,12,13,18};
		ascendingSort(Card);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(Card));
		}		
		
	static void ascendingSort(int array[]) {
        int size = array.length;
        
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
}
