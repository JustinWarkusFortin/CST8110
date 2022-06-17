import java.util.Scanner;

public class CarTester {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Car car1;  car1 = new Car(); 
		
		
		System.out.print("The default car attributes are: ");
		car1.displayCar();
		car1 = new Car("ABCD 123", 10,50.0);
		System.out.print("Initial car attributes are: ");
		car1.displayCar();
		Car car2 = new Car(car1);
		System.out.print("Copied car attributes are: ");
		car2.displayCar();
		System.out.println("\nUpdate car attributes: ");
		car1.inputPlate(scan);
		car1.inputTime(scan);
		car1.inputVelocity(scan);
		System.out.println("\nUpdated car attributes are: ");
		car1.displayCar();
	
		scan.close();
	}
}
