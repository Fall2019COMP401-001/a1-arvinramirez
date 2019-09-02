package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalNumber = scan.nextInt();
		
		for(int i=0; i<totalNumber; i++) {
			//get next string 
			String firstName = scan.next();
			String lastName = scan.next();
			//get number
			int totalItems = scan.nextInt();
			String firstLetter = firstName.toCharArray()[0] + ".";
			
			//loop through total items for this person
			double totalPrice = 0.0;
			for(int j=0; j<totalItems; j++) {
				int itemQuantity = scan.nextInt();
				String item = scan.next();
				double value = scan.nextDouble();
				totalPrice += itemQuantity * value;
			}
			System.out.println(firstLetter + " " + lastName + ": " + String.format("%.2f", totalPrice));
		}
		
		// Your code follows here.
		
	}
}
