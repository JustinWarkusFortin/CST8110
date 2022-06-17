import java.security.SecureRandom;

public class DiceGame {

	public static void main(String[] args) {

		
		 int die1;
		 int die2;
		 int sum;
		 
		 SecureRandom Dice = new SecureRandom();

		
		  die1 = 1 + Dice.nextInt(6); 
		  die2 = 1 + Dice.nextInt(6);
		  
		  System.out.println ("Jt rolled a: " +die1);
		  System.out.println("Rosie rolled a: " + die2);
		  
		  if(die1 > die2) {
			  System.out.print("Jt wins!");
		  }
		  else if(die1 < die2) {
			  System.out.print("Rosie wins!");
		  }
		  else if(die1 == die2) {
			  System.out.print("Its a tie!");
		  }
		
	}

}
