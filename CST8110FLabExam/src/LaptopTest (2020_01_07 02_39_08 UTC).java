
public class LaptopTest {
	
	public static void main(String[] args) {

		System.out.println("Welcome to Student Computer Sales\n");
		
		Laptop Laptop1 = new Laptop();
		Laptop Laptop2 = new Laptop("Intel Core i7",12,500,800);
		Laptop Laptop3 = new Laptop();
		
		Laptop3.enterSpecifications();
		System.out.printf("%-10s\t%-10s%-10s\t%-10s%n","\nComputer name","RAM[GB]","Hard Drive","Base Price");
		Laptop1.displaySpecifications();
		Laptop2.displaySpecifications();
		Laptop3.displaySpecifications();
	}

}
