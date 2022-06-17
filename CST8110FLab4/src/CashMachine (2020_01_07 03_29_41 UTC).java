import java.util.Scanner;

	public class CashMachine {

		
			private Scanner consoleInput;
			private int itemCount;
			private double tax;
			private double sum;
			private String receipt = "";
	
		
		public CashMachine(double tax) {
			
			consoleInput = new Scanner(System.in);
			this.tax = tax;
			itemCount = 0;
				
			}

		private String getOneStringInput(String wordInput) {
		
			System.out.print(wordInput);
			wordInput = consoleInput.next();
			
			return wordInput;
			}

		private double  getOneDoubleInput(String doubleInput) {
					
			System.out.print(doubleInput);
			return consoleInput.nextDouble();
			}
		
		private int getItemCount() {
	
			return itemCount;
			}

		private double calculateTax() {
			
			return sum*tax;
			}
		
		private double calculateTaxPlusSum() {
			
			return calculateTax()+sum ;
			
			}

		public boolean processMenu() {
			
			double input = getOneDoubleInput("Action >> ");
			
			if(input == 1) {
				purchaseItem();	
			}
			else if(input == 2) {
				printReceipt();
				
			}
			else if (input == 3) {
				return false;
			}

			return true;
			
			}
		
		public void printMenu() {
			
				System.out.print("\n1)Purchase Item\n2)Print Receipt\n3)Quit\n\n");
		

			}
		
		private void purchaseItem() {
			
			String itemEntered =getOneStringInput("item name (no spaces) >>");
			double itemPrice = getOneDoubleInput("item price >>>");
			itemCount++;
			sum += itemPrice;
			receipt += String.format("%-15s$%.2f%n", itemEntered, itemPrice);
			}

		private void printReceipt() {
			
			if(itemCount == 0) {
				System.out.println("Empty!!");
			}
			else {
				System.out.println("\nReceipt for " + itemCount + " item(s)\n\n");
				System.out.println(receipt);
				System.out.println("Taxes for items purchased: " +calculateTax());
				System.out.println("Total: " +calculateTaxPlusSum());
			}
			
		}
		
}
		
		
		
		
		

