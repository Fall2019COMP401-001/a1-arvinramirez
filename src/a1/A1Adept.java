package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
	public String name;
	public double price;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

class Person {
	public String fullName;
	public double totalSpent;

}

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		
		List<Item> items = new ArrayList<Item>();
		int totalItems = scan.nextInt();
		
		for(int i=0; i<totalItems; i++) {
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			items.add(new Item(itemName, itemPrice));
		}
		
		int totalCustomer = scan.nextInt();
//		double biggestPrice = 0;
//		double smallestPrice = 10000000;
//		String biggestSpender = null;
//		String smallestSpender = null;
		
		List<Person> persons = new ArrayList<Person>();
		
		for(int i=0; i<totalCustomer; i++) {
			double totalSpent = 0;
			Person person = new Person();
			//name
			String firstName = scan.next();
			String lastName = scan.next();
			person.fullName = firstName + " " + lastName;
			
			double totalPrice = 0;
	 		//total price
			int itemsBought = scan.nextInt();
			
			for(int j=0; j<itemsBought; j++) {
				int totalNumber = scan.nextInt();
				String nextItem = scan.next();
				
				double itemPrices = 0;
				
				for(Item it: items) {
					if(it.name.equals(nextItem)) {
						itemPrices = it.price * totalNumber;
						totalPrice = itemPrices;
						totalSpent += totalPrice;				
					}
				}
			}
			person.totalSpent = totalSpent;
			persons.add(person);
		}
		Person smallestSpender = new Person();
		smallestSpender.totalSpent = 0.0;
		for(Person person: persons) {
			if(smallestSpender.totalSpent == 0.0) {
				smallestSpender.totalSpent = person.totalSpent;
				smallestSpender.fullName = person.fullName;
			}
			if(smallestSpender.totalSpent > person.totalSpent) {
				smallestSpender.totalSpent = person.totalSpent;
				smallestSpender.fullName = person.fullName;				
			}
		}
		
		Person biggestSpender = new Person();
		biggestSpender.totalSpent = 0.0;
		
		double totalValue = 0.0;
		for(Person person: persons) {
			if(biggestSpender.totalSpent == 0.0) {
				biggestSpender.totalSpent = person.totalSpent;
				biggestSpender.fullName = person.fullName;
			}
			if(biggestSpender.totalSpent < person.totalSpent) {
				biggestSpender.totalSpent = person.totalSpent;
				biggestSpender.fullName = person.fullName;				
			}
			totalValue += person.totalSpent;
		}
		
		double average = totalValue / totalCustomer;

		System.out.println("Biggest: " + (biggestSpender.fullName) + " (" +biggestSpender.totalSpent + ")");
		System.out.println("Smallest: " + (smallestSpender.fullName) + " (" + smallestSpender.totalSpent + ")");
		System.out.println("Average: " + (average));
	}
}

