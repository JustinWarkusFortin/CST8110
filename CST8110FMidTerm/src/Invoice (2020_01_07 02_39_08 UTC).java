import java.util.Scanner;


		public class Invoice {

			private String clientName;
			private int invoiceNumber;
			private double invoiceAmount;
			
	
		
		public Invoice() {
			
			 clientName = "unknown";
			 invoiceNumber = -999;
			 invoiceAmount = 0;
		}
		
		public Invoice(String clientName, int invoiceNumber, double invoiceAmount) {
		
			this.clientName = clientName;
			this.invoiceNumber = invoiceNumber;
			this.invoiceAmount = invoiceAmount;
		}
		
		public void inputClientName(Scanner scan) {
		
			System.out.print("Enter client name: ");
			clientName = scan.nextLine();
		}
		
		public void inputInvoiceNumber(Scanner scan) {
	
			System.out.print("Enter invoice number:");
			invoiceNumber = scan.nextInt();
		}
		
		public void inputInvoiceAmount(Scanner scan) {
			
			System.out.print("Enter invoice amount:");
			invoiceAmount = scan.nextDouble();
		}
		
		public double calculateInvoiceTax() {
			
			double	invoiceTax = (invoiceAmount*0.15);
			return invoiceTax;
			
		}

		public void displayInvoice() {
			
			System.out.print("\nInvoice number: "+this.invoiceNumber+"\nClient name: "+this.clientName+"\nInvoice amount: "+this.invoiceAmount+"\n15% invoice tax: "+calculateInvoiceTax()+"\n\n");
		}
}
		
