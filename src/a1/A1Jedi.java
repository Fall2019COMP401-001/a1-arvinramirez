package a1;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

class Food {
	public String name;
	public int count;
	public int quantity;
	
}

public class A1Jedi {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Food> grocery = new ArrayList<Food>();
		
		int totalFood = scan.nextInt();
		
		for(int i=0; i<totalFood; i++) {
			Food food = new Food();
			String name = scan.next();
			food.name = name;
			grocery.add(food);
			double itemPrice = scan.nextDouble();
		}	
		
		int totalCustomer = scan.nextInt();
		for(int i=0; i<totalCustomer; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			
			int totalItems = scan.nextInt();
			
			ArrayList<String> addedItems = new ArrayList<String>();
			for(int j=0; j<totalItems; j++) {
				int quantityCount = scan.nextInt();
				String foodName = scan.next();
				
				for(Food food: grocery) {
					if(food.name.equals(foodName)) {
						if(!addedItems.contains(food.name)) {
							food.count +=1;	
							addedItems.add(food.name);
						}
						food.quantity += quantityCount;
					}
				}
			}
		}

		for(Food food: grocery) {
			if(food.count == 0) {
				System.out.println("No customers bought " + food.name);
			}
			if (food.count > 0) {
				System.out.println(food.count + " customers bought " + food.quantity + " " + food.name);
			}
		}
		
	}
}
