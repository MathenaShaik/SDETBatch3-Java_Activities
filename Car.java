package javaActivity1;

public class Car {
	//Adding variables below
	String color;
	int make;
	String transmission;
	int tyres;
	int doors;
	
	Car(){
		tyres=4;
		doors=4;
	}
	
	public void DisplayCharacteristics() {
		System.out.println("Car color = " +color);
		System.out.println("No of Tyres in Car = " +tyres);
		System.out.println("No of doors in Car = "+doors);
		System.out.println("Make of Car = "+make);
		System.out.println("Transmission of Car = "+ transmission);
	}
	
	public void accelerate() {
		System.out.println("Car will move forward");
	}
	
	public void brake() {
		System.out.println("Car will not move forward");
	}
	
	
}
