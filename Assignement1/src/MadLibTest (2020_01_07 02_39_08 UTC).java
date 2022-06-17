

public class MadLibTest {
	
	public static void main(String[] args) {

		Madlib story1; story1 = new Madlib();
		Madlib story2; story2 = new Madlib();
		
	System.out.println("The program will prompt you for an array of words to create a MadLib story.\n");
	
		story1.inputVerb1();
		story1.inputVerb2();
		story1.inputNoun1();
		story1.inputAdjective1();
		story1.inputOccupation();
		story1.inputAnimal();
		story1.inputAdjective2();
		story1.inputVerb3();
		story1.inputNoun2();
		story1.MadLib();
		System.out.println("\nA second story will now begin to prompt you for a new array of words to create a second MadLib\n");
		story2.inputNoun3();
		story2.inputTime1();
		story2.inputObject1();
		story2.inputPlace1();
		story2.inputObject2();
		story2.MadLib2();
	}

	
		
}

	



