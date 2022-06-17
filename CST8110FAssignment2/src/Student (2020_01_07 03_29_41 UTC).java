/* Justin-Thomas Warkus-Fortin
 * CST8110F Section 300 Introduction to programming
 * Carolyn Macisaac
 * 
 * This program is a GPA calculator that takes input from the user to print our a students number, name, total marks, gpa and lastly their letter grade.
 * Should the student fail any classes they will automatically receive a GPA of 0 and letter grade F.
 */


import java.util.*;


public class Student {
	
	//Declaring the variables
	private long studNumber;
	private String firstName;
	private String lastName;
	private double[] marks;
	private double totalMarks;
	private double totalBonus;
	private double gpa;
	static final int NUMBER_MARKS = 3;
	Scanner input;	
	
	//No arg constructor
	public Student() {
		this.marks = new double[NUMBER_MARKS];
		this.input = new Scanner(System.in);
		
	}
	//Getting input from user about each student with their grades and bonuses
	public void readStudentDetails() {
		
		//Prompts user for the student number, first name, and last name
		System.out.print("Enter student number: ");
		studNumber = input.nextLong();
		System.out.print("Enter first name: ");
		firstName = input.next();
		System.out.print("Enter last name: ");
		lastName = input.next();
		
		//Invokes the readMarks method to prompt user for the students grades
		readMarks();
		
		//Prompts the user to enter the number of bonuses
		System.out.print("Enter number of bonuses (Should not be greater than 5): ");
		double numBonus = input.nextDouble();		
			
			while(numBonus > 5 || numBonus < 0) {
			System.out.print("Number of bonuses should not be greater than 5!!!\n\n");
			System.out.print("Enter number of bonuses (Should not be greater than 5): ");
			numBonus =input.nextDouble();
			}
		//Invokes the readBonuses method to prompt the user for each bonus (if any)
		readBonuses(numBonus);
		
	}
	//Method to prompt the user for student grades
	private void readMarks(){
		for(int j = 1; j <= NUMBER_MARKS; j++) {
			do {
			System.out.print("Enter mark " + j + ":");
			marks[j-1] = input.nextDouble();

				if(marks[j-1] < 0 || marks[j-1] > 100) {
					System.out.print("Numbers must be between 0 and 100. Please re-enter:\n");

				}
			
			}while(marks[j-1] < 0 || marks[j-1] > 100);
			totalMarks += marks[j-1];
		
			
		}
	}
	
	//Method to prompt the user for the bonus the student is receiving
	private void readBonuses(double numBonus) {
		
			for(int j = 1; j <= numBonus; j++) {
			
					System.out.print("Enter bonus " +j+ ": ");
					totalBonus += input.nextDouble();	
			}
	}
	
	//Calculates the students's gpa and uses the checkEligibility method to determine if the student receives a 0
	public void calculateGPA() {
		convertBonus();
		totalMarks += totalBonus;
		gpa = (totalMarks / (NUMBER_MARKS * 100)) * 4;
			if(gpa > 4) {
			gpa = 4;
			}
			else if(checkEligibility() == false) {
				gpa = 0.0;
			}
	
		
	}
	
	//Converts the students bonuses to help augment their grades
	public void convertBonus() {
		if (totalBonus > 15) {
			totalBonus = 15;
		}
		
		totalBonus = (totalBonus/15) * 2;
	}
	
	//Uses the percentage of the students grades and prints the corresponding letter
	private String findGradeLetter() {
		
		//If the student failed any classes they receive an F
		if(checkEligibility() == false) {
			return "F";
			}
				
			
				else if (calculatePercentage() >= 50 && calculatePercentage() < 53) {
					return "D-";
				}
				else if (calculatePercentage() >= 53 && calculatePercentage() < 57) {
					return "D";
				}
				else if (calculatePercentage() >= 57 && calculatePercentage() < 60) {
					return "D+";
				}
				else if (calculatePercentage() >= 60 && calculatePercentage() < 63) {
					return "C-";
				}
				else if (calculatePercentage() >= 63 && calculatePercentage() < 67) {
					return "C";
				}
				else if (calculatePercentage() >= 67 && calculatePercentage() < 70) {
					return "C+";
				}
				else if (calculatePercentage() >= 70 && calculatePercentage() < 73) {
					return "B-";
				}
				else if (calculatePercentage() >= 73 && calculatePercentage() < 77) {
					return "B";
				}
				else if (calculatePercentage() >= 77 && calculatePercentage() < 80) {
					return "B+";
				}
				else if (calculatePercentage() >= 80 && calculatePercentage() < 85) {
					return "A-";
				}
				else if (calculatePercentage() >= 85 && calculatePercentage() < 90) {
					return "A";
				}
				else if (calculatePercentage() >= 90 && calculatePercentage() <= 100) {
					return "A+";
				}
			
			return "FSP";
	
	}
	
	//Checks if the student failed any classes 
	private boolean checkEligibility() {
		for(int j = 0; j < NUMBER_MARKS; j++) {
			if(marks[j] < 50) {
				return false;
			}
		}
		return true;
	}
	
	//Caluculates the students average in percent to be transformed into a letter
	private double calculatePercentage() {
		return (totalMarks / (NUMBER_MARKS * 100)) * 100;
		

	}
	
	//Displays all of the student details including a String failNote beside their row if they failed a class
	public void displayStudentDetails() {
		
			
			String failNote = "NOTE: Failed 1 or more courses";
			
				
				if (checkEligibility() == false) {
					System.out.printf("%-15s|%-15s|%-15.2f|%-4.2f|%-20s %-20s %n"
							, studNumber, firstName +" "+ lastName, totalMarks, gpa, findGradeLetter(), failNote);
				}else
				System.out.printf("%-15s|%-15s|%-15.2f|%-4.2f|%-20s| %n"
						, studNumber, firstName +" "+ lastName, totalMarks, gpa, findGradeLetter());
	}
	
	//Displays the title of the program
	public static void displayTitle() {
		
		System.out.println("GPA CALCULATOR\n=============");
		
	}
	
	//Displays the header for all the attributes that a student will have 
	public static void displayHeader() {
		
		System.out.println("\n****************************************************************************");
		System.out.println("                              MARK LIST");
		System.out.println("****************************************************************************");
		
		System.out.printf("%-15s|%-15s|%-15s|%-4s|%-20s %n", "Student Number", "Name", "Total Marks", "GPA", "Grade Letter");
		
		System.out.println("----------------------------------------------------------------------------");

	}
}
	
	