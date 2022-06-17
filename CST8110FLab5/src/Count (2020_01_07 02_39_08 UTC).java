import java.util.Scanner;

public class Count {
	
	private int startNum;
	private int stepSize;
	
	public Count() {this(0, 0);}
	public Count(int startNum, int stepSize) {this.startNum = startNum; this.stepSize = stepSize;}
		
	public void getValuesFromUser() {
		Scanner userInput = new Scanner(System.in);
		
		while (startNum <= 0) {
			System.out.print("\nEnter the start value: ");
			startNum = userInput.nextInt();
			if (startNum <= 0) {
				System.out.println("**********Invalid Entry*********");
			}
				
			
		}
		while(stepSize <= 0) {
			System.out.print("Enter countdown step size: ");
			stepSize = userInput.nextInt();
			if (stepSize <= 0) {
				System.out.println("**********Invalid Entry*********");
				
			}
			
		}
		
  }

	public void displaySteps() {
		System.out.println("The numbers are: ");
		for(int sn = startNum; sn >= 1; sn -= stepSize) {
			System.out.print(sn+ " " );
		}
		System.out.print("\n\n ");

		
		
	}
	
}
