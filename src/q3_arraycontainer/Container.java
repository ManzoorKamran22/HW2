package q3_arraycontainer;

import java.util.Scanner;

public class Container {

	public static void main(String[] args) {
		
		//Printing to the console
		System.out.println("Plese enter a number: ");
		
		//Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Storing the input value into a integer variable called 'inputNum'.
		int inputNum = sc.nextInt();
		
		//Creating a new integer array object and set the size as 'inputNum' variable.
		int [] numbers = new int[inputNum];
		
		//Storing integer number to the array
		for(int i=0; i<numbers.length; i++) {
	
			numbers[i] = i+1;
		}
		
		//Retrieving values from the array variable and writing it to the console.
		for(int j=0; j<numbers.length; j++) {
		System.out.println("Index " + j + ": Value " + numbers[j]);
		
		}
		
		//Closing the scanner method
		sc.close();

	}

}
