import java.util.Scanner;

public class MagSub {
	

	private String magazineTitle;
	private double cost;
	private int mediaSelection;
	private Scanner input;
	
	public MagSub() {magazineTitle = "data not entered"; mediaSelection = 2; cost = 0.0; input = new Scanner(System.in);}
	public MagSub(String magazineTitle, double cost,int mediaSelection) {this.magazineTitle = magazineTitle; this.mediaSelection = mediaSelection; this.cost = cost;}                     

	public void enterMagazineInformation() {
		System.out.print("\nEnter Magazine Title: ");
			magazineTitle = input.nextLine();
			
		System.out.print("\nEnter Magazine Cost: ");
			cost = input.nextDouble();
		System.out.print("\nChoose a Subscription Media: \n1.Print Subscription \n2.Digital Subscription \n3.Digital +Print Subscription \n\nChoice>>");
		mediaSelection = input.nextInt();
		while (mediaSelection > 3 || mediaSelection <= 0) {
			System.out.print("\nInvalid Choice\n");
			System.out.print("Choose a Subscription Media: \n1.Print Subscription \n2.Digital Subscription \n3.Digital +Print Subscription \n\nChoice>>");
			mediaSelection = input.nextInt();
		}
	}
	
	public double calculatePrice() {
		if (mediaSelection == 1) {
			cost = cost * 1.80;
		}else if (mediaSelection == 2) {
			cost = cost * 1.20;
		}else if (mediaSelection == 3) {
			cost = cost * 2.00;
		}
		return cost;
	}
	
	public void printMagazineDetails() {
		double price = calculatePrice();
		String media = "Not Set";
		if (mediaSelection == 1) {
			media = "Print";
		}else if (mediaSelection == 2) {
			media = "Digital";
		}else if (mediaSelection == 3) {
			media = "Digital + Print";
		}
		System.out.printf("\n%-15s \t %-15s\t %4.2f", magazineTitle,media,price);
	}
}