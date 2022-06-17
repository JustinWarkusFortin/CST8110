
public class PoolTest {
	
	public static void main(String[] args) {
		
		Pool pool1 = new Pool();
		Pool pool2 = new Pool("Nautilus Superiour", 3, true, 417.56);
		Pool pool3 = new Pool();
		
		System.out.println("Welcome to pools emporium");
		pool3.enterPoolSpecifications();
		System.out.print("Name\t\tShape\t\tUnderground\t\tArea\n");
		pool1.displayPool();
		pool2.displayPool();
		pool3.displayPool();
		
		
		
	}
}
