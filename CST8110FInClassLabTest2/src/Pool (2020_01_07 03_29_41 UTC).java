import java.util.Scanner;
import java.text.DecimalFormat;

public class Pool {
	
	private String modelName;
	private int shape;
	private boolean underground;
	private double area;
	private Scanner input;
	
	public Pool() {
	
	this.modelName = "not set";
	this.shape = 2;
	this.underground = false;
	this.area = 0.0;
	
	}

	public Pool(String modelName, int shape, boolean underground, double area) {
	
	this.modelName = modelName;
	this.shape = shape;
	this.underground = underground;
	this.area = area;
		
	}
	
	public void enterPoolSpecifications() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter model name: ");
		modelName = input.next();
		
		System.out.print("Enter 1 for above ground, 2 for below ground: ");
		int choice;
		do {
			choice = input.nextInt();
			if(choice == 1) {
				underground = false;
			}
			else if(choice == 2) {
				underground = true;
			}
			else {
				System.out.print("Invalid choice. ");
			}
		}while (choice != 1 && choice !=2);
		
		System.out.print("Choose shape of swimming pool: \n");
		System.out.println("1) Rectangle\n2) Round\n3) Eclipse");
		do {
			shape = input.nextInt();
			if(shape == 1) {
				area = calculateArea(1);
			}
			else if(shape == 2) {
				area = calculateArea(2);
			}
			else if(shape == 3) {
				area = calculateArea(3);
			}
			else {
				System.out.print("Invalid choice");
			}
		}while(shape != 1 && shape != 2 && shape != 3);
		
	}
	
	public double calculateArea(int shape) {
		Scanner input = new Scanner(System.in);

			
			if(shape == 1) {
				System.out.print("Enter width: ");
				area = input.nextDouble();
				System.out.print("Enter length: ");
				area = input.nextDouble();
				area = input.nextDouble()*input.nextDouble();
	}
			else if(shape == 2) {
				System.out.print("Enter length of major axis: ");
				area = input.nextDouble();
				System.out.print("Enter length of minor axis: ");
				area = input.nextDouble();
				area = 3.14*input.nextDouble()*input.nextDouble();	
	}
			else if(shape == 3) {
				System.out.print("Enter radius:");
				area = input.nextDouble();
				area = 3.14*input.nextDouble()*input.nextDouble();	
	}
			else if (shape > 3 || shape < 0) {
				System.out.print("Please enter a number between 1 and 3");
			
	}
			return area;
		
	}
	
	public void displayPool() {
		String sArea;
		
		if(shape == 1) {
			sArea = "Rectangle";
		}
		if(shape == 2) {
			sArea = "Round";
		}
		if(shape == 3) {
			sArea = "Eclipse";
		}
		System.out.printf("%-10s%-10d%-10s%-10.2f",modelName,shape,underground,area);
	}
	
	
}
