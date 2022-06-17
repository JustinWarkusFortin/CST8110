/* Justin-Thomas Warkus-Fortin
 * CST8110F Section 300 Introduction to programming
 * Carolyn Macisaac
 * 
 * This program is a GPA calculator that takes input from the user to print our a students number, name, total marks, gpa and lastly their letter grade.
 * Should the student fail any classes they will automatically receive a GPA of 0 and letter grade F.
 */

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
			//Displaying the title for the user to see
			Student.displayTitle();
		
			//Declaring 2 variables
			Scanner input = new Scanner(System.in);
			int numStudents;
		
			//Prompts user for the number of students they would like to enter (Cannot be 0 or negative)
			System.out.print("Enter number of students: ");
			numStudents = input.nextInt();
			
			while(numStudents <= 0) {
			System.out.print("Invalid number of students\nEnter number of students: ");
			numStudents = input.nextInt();
			}
		
		
			Student[] students = new Student[numStudents];
		
			//Creating a loop to prompt the user for the student information for the amount of students they entered
			for(int j = 0; j < students.length; j++) {
			
			System.out.print("\nEnter details of Student " + (j+1) + "\n~~~~~~~~~~~~~~~~~~~~\n");
			
			students[j] = new Student();
			students[j].readStudentDetails();
			students[j].calculateGPA();
			
			}
		
			//Displays the header before displaying all the students and their respective information
			Student.displayHeader();
		
			//A for loop to have the program display the student details until all students have been shown
			for(int j = 0; j < numStudents; j++) 
			students[j].displayStudentDetails();
		
		input.close();
		}
		
		
	}


