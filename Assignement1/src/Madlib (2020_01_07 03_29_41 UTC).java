import java.util.Scanner;

/**This program prompts you for 2 seperate array of words to create 2 different MadLib stories.
 * @author Justin-Thomas Warkus-Fortin
 * @version 1.0
 * @since 2019-10-04
 **/

public class Madlib {

	//First MadLib variables
	private String verb1Wark0025;
	private String verb2Wark0025;
	private String noun1Wark0025;
	private String adjective1Wark0025;
	private String occupationWark0025;
	private String animalWark0025;
	private String adjective2Wark0025;
	private String verb3Wark0025;
	private String noun2Wark0025;
	
	//Second MadLib variables
	private String noun3Wark0025;
	private String time1Wark0025;
	private String object1Wark0025;
	private String place1Wark0025;
	private String object2Wark0025;

	

	
	public Madlib() {
	
	}
	
	public void inputVerb1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a verb :");
		verb1Wark0025 = scan.nextLine();
	
	}
	
	public void inputVerb2() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a verb ending in 'ing':");
		verb2Wark0025 = scan.nextLine();
		
	}
	
	
	public void inputNoun1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a noun:");
		noun1Wark0025 = scan.nextLine();
		
	}
	
	public void inputAdjective1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an adjective :");
		adjective1Wark0025 = scan.nextLine();
	
	}
	 
	public void inputOccupation() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an occupation :");
		occupationWark0025 = scan.nextLine();
		
	}
	
	public void inputAnimal() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an animal :");
		animalWark0025 = scan.nextLine();
		
	}
	
	public void inputAdjective2() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an adjective :");
		adjective2Wark0025 = scan.nextLine();
		
	}
	
	public void inputVerb3() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a verb ending in 'ing':");
		verb3Wark0025 = scan.nextLine();
		
	}
	
	public void inputNoun2() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a noun :");
		noun2Wark0025 = scan.nextLine();
	
	}
	
	public void MadLib() {
		System.out.println("\nMy name is " +verb1Wark0025+ "; learn it well, for it's the " +verb2Wark0025+ " sound of your " +noun1Wark0025+ ".\nI told Killian i'd be " +adjective1Wark0025+ ". I wouldn't want to be a/an " +occupationWark0025+ ".\nI'm a cybernetic " +animalWark0025+ ": living tissue over a/an " +adjective2Wark0025+ " endoskeleton.\nIf things have gone wrong, I'm " +verb3Wark0025+ " myself, and you've got a wet " +noun2Wark0025+ " wrapped around your head.\n-Arnold Schwarzenegger");	 			
		
	}
	
	//Second MadLib story begins
	
	public void inputNoun3() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a noun:");
		noun3Wark0025 = scan.nextLine();
	
	}
	
	public void inputTime1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an amount of time in hours:");
		time1Wark0025 = scan.nextLine();
	
	}
		public void inputObject1() {
			
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an object :");
		object1Wark0025 = scan.nextLine();
	
	}
	
	public void inputPlace1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a location :");
		place1Wark0025 = scan.nextLine();

	}
	
	public void inputObject2() {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an object :");
		object2Wark0025 = scan.nextLine();
	
	}
	
	public void MadLib2() {
		
		System.out.println("\nYou wake up suddenly, in your " + noun3Wark0025 + " after having napped for " + time1Wark0025 + " hours.\nGroggy, you grab your " + object1Wark0025 + " and head to (the) " + place1Wark0025 + ". Upon arrival, you realize you left your " + object2Wark0025 + " at home.\nForgetting about your " + object2Wark0025 + ", you set out for some much needed coffee.\nAs you head back home after your short visit, you realize that your " + object2Wark0025 +" was in the backseat the whole time.");
				
	}
}

