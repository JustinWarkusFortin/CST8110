import java.util.Scanner;
import java.text.DecimalFormat;

public class Account {

	private long accountNumber;
	private String name;
	private double balance;
	private double interestPercent;
	private double interestAmount;
	
	
	public Account() {accountNumber = 1001; name = "Not Set"; balance = 100; interestPercent = 0.01;}
	public Account(long accountNumber, String name, double balance, double interestPercent) {this.accountNumber = accountNumber; this.name = name;
				   this.balance = balance; this.interestPercent = interestPercent;}
		
	public void readInfo() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter an account number: ");
		accountNumber = scan.nextLong();
		System.out.print("Please enter a name: ");
		name = scan.next();
		System.out.print("Please enter a balance: ");
		balance = scan.nextDouble();
		System.out.print("Please enter interest percent: ");
		interestPercent = scan.nextDouble();
		if(interestPercent < 0) {
			System.out.print("Interest percent must be a positive number\nPlease reenter interest percent");
			interestPercent = scan.nextDouble();
			}while(interestPercent < 0);
		
		scan.close();
		}
	
	public void calculateInterest() {
		interestAmount = balance*interestPercent/100;
	}
	
	public void displayInfo() {
		

		System.out.printf("%-10d%-10s%-10.2f%-10.2f%-10.2f%n",accountNumber,name,balance,interestPercent,interestAmount);
	}
	
	

}