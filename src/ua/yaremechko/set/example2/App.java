package ua.yaremechko.set.example2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Storage storage = new Storage();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			menu();
			switch (scanner.nextInt()) {
			case 1: {
				storage.addCommodity();
				break;
			}
			case 2: {
				storage.removeCommodity();
				break;
			}
			case 3: {
				storage.replaceCommdity();
				break;
			}
			case 4: {
				storage.sortByName();
				break;
			}
			case 5: {
				storage.sortByLength();
				break;
			}
			case 6: {
				storage.sortByWidth();
				break;
			}
			case 7: {
				storage.sortByWeigth();
				break;
			}
			case 0: {
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + scanner.nextInt());
			}
		}
		
	}
	
	public static void menu() {
		
		System.out.println();
		
		System.out.println("Enter 1 to add commodity");
		System.out.println("Enter 2 to delete commodity");
		System.out.println("Enter 3 to replace commodity");
		System.out.println("Enter 4 to sort the product by name");
		System.out.println("Enter 5 to sort the product by length");
		System.out.println("Enter 6 to sort the product by width");
		System.out.println("Enter 7 to sort the item by weight");
		System.out.println("Enter 0 to EXIT");
		
	}
	
}


