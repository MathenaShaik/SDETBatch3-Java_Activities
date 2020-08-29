package javaActivity2;

public class Activity2_1{
	
	public static void main(String[] args) {
		
		Book newNovel = new MyBook();
			
		String title="Book on Racing car";
		newNovel.setTitle(title);
		
		System.out.println("Title is: " +newNovel.getTitle());
		
	}	
}

abstract class Book {

	String title;
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{	
	public void setTitle(String s) {
		title=s;
	}
}


