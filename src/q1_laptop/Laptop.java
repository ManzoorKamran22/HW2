package q1_laptop;

import java.util.Scanner;

public class Laptop {
	
	public static String staticVar = "Our budget to buy a new Laptop is: ";
	public static int price = 2500;
	public String laptopName;
	public String modelName;
	public int builtYear;
	public int ramSize;
	public int ssdSize;
	public double screenSize;
	public static Scanner input = new Scanner(System.in);
	
	//Constructor 1 - with zero parameter
	public Laptop(){
		System.out.println("******************************************************");
		System.out.println("Hello, from Laptop constructor 1");
		System.out.println(staticVar);	
	}
	
	//Constructor 2 - with multiple parameters
	public Laptop(String laptopName, String modelName, int builtYear, int ramSize, int ssdSize, double 	screenSize){
		System.out.println("--------------------------------------------------");
		System.out.println("Hello, from Laptop constructor 2: ");
		this.laptopName = laptopName;
		this.modelName = modelName;
		this.builtYear = builtYear;
		this.ramSize = ramSize;
		this.ssdSize = ssdSize;
		this.screenSize = screenSize;
		System.out.println("Laptop Name: " + laptopName + "\n" + "Model Name: " + modelName + "\n" + 
							"Built Year: " + builtYear + "\n" + "Ram Size: " + ramSize + "GB" + "\n" + 
							"SSD Size: " + ssdSize + "GB" +"\n" + "Screen Size: " + screenSize + " inch");
		
		
		
	}
	
	
	//Non-Static Method - 1
	public int getPrice() {
		return price;
	}
	
	//Non-Static Method - 2
	public void updateScreenSize(double screenSize) {
		System.out.println("The new updated Screen size is: " + screenSize + " inch");
	}
	
	//Static Method - 1
	public static void yourLaptop() {
		System.out.println("Please enter the laptop brand that you are currently using: ");
		String yourLaptopBrand = input.next();
		System.out.println("Your current laptop brand is : " + yourLaptopBrand);
	}	

}
