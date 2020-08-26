package javaActivity2;

public class Activity2 {
	
	public static void main(String[] args) {

	int[] addition = {10, 77, 10, 54, -11, 10};
	
	System.out.println(addition.length);
	int searchNum=10;
	int fixedSum=30;		
	
	System.out.println("Result " +result(addition,searchNum,fixedSum));
	}
	
	public static boolean result(int[] addition , int searchNum, int fixedSum) {
		int temp = 0;
		
		//loop into addition array for getting number 10
		for(int number : addition) {
			
			//Check if number is equal to 10
			if(number==searchNum) {
				//Add to variable when number is equal to 10
			temp += searchNum;
			}
			
			//sum greater than 30 
			if(temp>fixedSum) {
				break;
			}
		}
		
	return temp == fixedSum;
	}
}
