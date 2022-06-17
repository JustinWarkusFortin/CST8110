import java.util.Scanner;


public class InvoiceDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Invoice invoice1 = new Invoice();
		Invoice invoice2 = new Invoice("John Smith", 124, 68.59);
		
		invoice1.displayInvoice();
		invoice2.displayInvoice();
		Invoice invoice3 = new Invoice();
		invoice3.inputClientName(scan);	
		invoice3.inputInvoiceNumber(scan);	
		invoice3.inputInvoiceAmount(scan);
		invoice3.displayInvoice();
		
		
		
	}
	

}