package q1_laptop;

public class TestLaptop {

	public static void main(String[] args) {
		
		Laptop lp1 = new Laptop();
		System.out.println("$" + lp1.getPrice() + " <--coming from Static Variable but non-Static method 1");
		System.out.println("******************************************************");
		
		Laptop lp2 = new Laptop("MacBook", "Pro" , 2019, 16, 256, 15.4);
		System.out.println("--------------------------------------------------");
		System.out.println("non-Static method 2: ");
		lp2.updateScreenSize(13);
		System.out.println("--------------------------------------------------");
		
		System.out.println("Static Method: ");
		Laptop.yourLaptop();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
		
	}

}
