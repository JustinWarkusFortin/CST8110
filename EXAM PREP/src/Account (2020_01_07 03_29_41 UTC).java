import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	long accountNumber;
	String name;
	double balance;
	double interestPercent;
	double interestAmount;
	
	
	
	public Account() {
		
		this.accountNumber = 1000;
		this.name = "Not Set";
		this.balance = 100;
		this.interestPercent = 0.01;
	}
	
	public Account(long accountNumber, String name, double balance, double interestPercent) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.interestPercent = interestPercent;
		
	}
	
	public void readInfo() {
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Please enter the account number: ");
		accountNumber = userInput.nextLong();
		
		System.out.print("Please enter a name: ");
		name = userInput.next();
		
		System.out.print("Please enter an account balance: ");
		balance = userInput.nextDouble();
		
		System.out.print("Please enter an interest percent: ");
		interestPercent = userInput.nextDouble();
		
		if(interestPercent < 0) {
			do {
			
			System.out.println("Interest percent must be a positive number.");
			System.out.print("Enter interest percent: ");
			interestPercent = userInput.nextDouble();
			
			}while(interestPercent <0);
				
			}
		userInput.close();
		}
	
	public void calculateInterest() {
		
		interestAmount = balance * interestPercent / 100;
	}
	
	public void displayInfo() {
		
		
		System.out.printf("%-10d%-10s%-10.2f%-10.2f%-10.2f%n",accountNumber,name,balance,interestPercent,interestAmount);
	}
	
	
}
