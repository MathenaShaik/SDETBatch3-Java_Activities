package javaActivity2;

import javaActivity2.Activity2_3.biCycleOperations;
import javaActivity2.Activity2_3.biCycleParts;

/**
 * 
 * @author MATHENASHAIK
 *
 */

public class Activity2_3 {

	public static void main(String[] args) {
		
	    MountainBike mb = new MountainBike(3, 0, 25);
	    System.out.println(mb.bicycleDesc());
	    mb.speedUp(20);
	    mb.applyBrake(5);	
		
	}
	
	interface biCycleParts{
		public int gears = 0;
		public int speed = 0;
	}
	
	interface biCycleOperations{
		public void applyBrake(int decrement);
		public void speedUp(int increment);
	}
}

class Bicycle implements biCycleParts, biCycleOperations{
	
	public int gears;
	public int speed;
	
	public Bicycle(int gears, int speed) {
		this.gears=gears;
		this.speed=speed;
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
	}

	@Override
	public void applyBrake(int decrement) {
		speed -= decrement;
		System.out.println("Current speed : "+speed);
		
	}

	@Override
	public void speedUp(int increment) {
		speed +=increment;
		System.out.println("Current speed :" +speed);
		
	}
}

class MountainBike extends Bicycle{
	
	public int seatHeight;

	public MountainBike(int gears, int speed, int startHeight) {
		super(gears, speed);
		seatHeight=startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight=newValue;
	}
	
	public String biCycleDesc() {
		return(super.bicycleDesc() + "\nSeat Height is " +seatHeight);
	}
}