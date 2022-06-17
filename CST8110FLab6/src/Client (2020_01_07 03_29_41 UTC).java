import java.util.Scanner;



public class Client {
	
	
	
		private String name = "";
		private int clientNumber = 0;
	    
	    Scanner input = new Scanner(System.in);
	    
	    public Client() {this("unassigned",-1);}
	    public Client(String name, int clientNumber) {this.name = name;this.clientNumber = clientNumber;}

	        
	        public void keyboardClientInfo() {
	                System.out.print("\nClient Name: ");
	                this.name = input.next();
	                System.out.print("\nClient Number: ");
	                this.clientNumber = input.nextInt();
	                
	        }

	        public void displayClientInfo() {
	            String display  = String.format("\n%s %7s |  %1s %d ",
	                    "Client Name: ",this.name,"Client Number: ",this.clientNumber);
	            System.out.print(display);
	            
	            
	        }

}
