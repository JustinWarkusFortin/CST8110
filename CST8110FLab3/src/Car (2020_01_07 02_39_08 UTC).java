/**This class simulates the functions of a car.
 * @author Justin-Thomas Warkus-Fortin
 * @version 1.0
 * @since 2019-10-03
 **/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Car {
	
	
	public String plate;
	public int time;
	public double velocity;
	private Scanner scan;

	
	 public Car() {
		 
		plate = "AAAA111";
		time = 10;
		velocity = 98.0;
				
		 
	 }
	 
	public Car(String plate, int time, double velocity) {
		
		this.plate = plate;
		this.time = time;
		this.velocity = velocity;
	
	}

	public Car(Car j)	{
		
		this.plate = j.plate;
		this.time = j.time;
		this.velocity = j.velocity;
		
	}
	
	
	public void inputPlate(Scanner scan) {
		System.out.print("Enter plate:");
		plate = scan.nextLine();
		
		
	}
	
	
	public void inputTime(Scanner scan) {
	
		System.out.print("Enter time:");
		time = scan.nextInt();
		
	}
	
	public void inputVelocity(Scanner scan) {
		
		System.out.print("Enter velocity:");
		velocity = scan.nextDouble();
	}
	
	 public String calcAcceleration() {
		 DecimalFormat df = new DecimalFormat(".##");
		 return df.format(velocity/time);
		
	 }
	
	public void displayCar() {
	
		System.out.println("Plate is " + plate + " with a time of " + time+ ","
						  + "a velocity of " + velocity +" and an acceleration of " + calcAcceleration() +" ");
		
	}


	
}






