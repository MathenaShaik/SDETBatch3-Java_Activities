package javaActivity2;

/**
 * 
 * @author MATHENASHAIK
 *
 */
public class Activity2_4 {
	public static void main(String[] a) {
		try {
			Activity2_4.exceptionTest("Will print to console");
			Activity2_4.exceptionTest(null);
			Activity2_4.exceptionTest("Wont Execute");
			 
		}catch (customException e) {
			System.out.println("Inside Catch Block :"+ e.getMessage());
		}
		
	}
	
	static void exceptionTest(String str) throws customException{
		if(str==null) {
			throw new customException("String value is null");
		}else {
			System.out.println("String value is : " +str);
		}
	}
}


class customException extends Exception{
	private String message = null;
	
	public customException(String message) {
		this.message=message;
	}
	
	public String getMessage(){
		return message;
	}

}



