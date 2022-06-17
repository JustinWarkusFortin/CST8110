
public class MagSubTest {

	public static void main(String[]args) {
		System.out.print("Welcome to The National World Magazine Subscription");
		MagSub subscription1 = new MagSub();
		MagSub subscription2 = new MagSub("National Geographic",10.00,3);
		MagSub subscription3 = new MagSub();
		
		subscription3.enterMagazineInformation();
		System.out.print("\n\nMagazine Title \t\t Media \t\t\t Price\n");
		subscription1.printMagazineDetails();
		subscription2.printMagazineDetails();
		subscription3.printMagazineDetails();
		
	}
	
}


