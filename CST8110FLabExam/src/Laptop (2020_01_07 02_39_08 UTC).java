import java.util.Scanner;

public class Laptop {

	private String name;
	private int ram;
	private int memory;
	private double basePrice;
	Scanner input;
	
	public Laptop() {this("No information", 0,0,0.0); } 
	public Laptop(String name, int ram, int memory,double basePrice) {this.name = name; this.ram = ram; this.memory = memory; this.basePrice = basePrice;}
	
	public void enterSpecifications() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a laptop name: ");
		name = input.nextLine();
		System.out.print("Please enter amount of ram [GB]: ");
		ram = input.nextInt();
		if(ram <= 0) {
			System.out.print("Ram must be a positive number.\nPlease enter amount of ram: ");
			ram = input.nextInt();
		}while(ram <= 0);
		System.out.print("Please enter amount of hard drive memory: ");
		memory= input.nextInt();
		System.out.print("Please enter the base price: ");
		basePrice = input.nextDouble();
	}
	
	private double calculateBasePrice() {
		
		if(ram == 12) {
			basePrice+=200;
		}
		else if(ram == 16) {
			basePrice+=300;
		}
		if(memory == 500) {
			basePrice+=300;
		}
		else if(memory == 1000) {
			basePrice+=400;
		}
		
		return basePrice;
	}
	
	public void displaySpecifications() {
		System.out.printf("%-10s\t%-10d%-10d\t%-10.2f%n",name,ram,memory,calculateBasePrice());
		
	}

}