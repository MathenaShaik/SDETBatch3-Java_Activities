package javaActivity2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException {
		Plane plane=new Plane(10);
		plane.onboard("John");
		plane.onboard("Joseph");
		plane.onboard("Jackson");
		
		System.out.println("Plane takes off at :" +plane.takeOff());
		
		System.out.println("List of Passengers: "+plane.getPassengers());
		
		//Wait for Plane Flying till land
		Thread.sleep(1000);
		
		plane.land();
		
		System.out.println("Plane landed at :" +plane.getLastTimeLanded());
		
		System.out.println("People on the plane after landing : " +plane.getPassengers());
		
	}
	
}

class Plane{
	
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOff;
	private Date lastTimeLanded;
	
	public Plane(int masPassengers) {
		this.maxPassengers=maxPassengers;
		this.passengers=new ArrayList<>();
	}
	
	public void onboard(String Passenger) {
		this.passengers.add(Passenger);
	}
	
	public Date takeOff() {
		this.lastTimeTookOff=new Date();
		return lastTimeTookOff;
	}
	
	public void land() {
		this.lastTimeLanded=new Date();
		this.passengers.clear();
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;			
	}
	
	public List<String> getPassengers(){
		return passengers;
	}
	
	
	
}


