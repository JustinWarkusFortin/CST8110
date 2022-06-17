import java.util.Scanner;

public class CountTest {

	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Count count = new Count();
		int numberEntered;
		
		System.out.println("Program developped by Justin Warkus-Fortin");
		
		do {
			System.out.println("\n1) Display count\n2) Quit\n");
			System.out.print("Enter your selection: ");
			numberEntered = userInput.nextInt();
		
			
				if (numberEntered == 1) {
		    	count.getValuesFromUser();
		    	count.displaySteps();	  	
		    }
				
				else if (numberEntered != 1 && numberEntered != 2) {
					System.out.println("*****Invalid Entry*****");
				}
				
			
		}while(numberEntered != 2);
		
		
			System.out.print("GoodBye!");
		
	

	}
	

}


