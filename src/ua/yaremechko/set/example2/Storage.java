package ua.yaremechko.set.example2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Storage {

	Scanner sc = new Scanner(System.in);

	public Storage() {
		super();
	}

	Set<Commodity> commodity = new LinkedHashSet<Commodity>();

	public void addCommodity() {
		System.out.println("Enter data to commodity: ");
		System.out.println();

		System.out.println("Enter name product: ");
		String productName = sc.next();
		System.out.println("Enter length product: ");
		int lengthProduct = sc.nextInt();
		System.out.println("Enter width product: ");
		int widthProduct = sc.nextInt();
		System.out.println("Enter weight product: ");
		int weightProduct = sc.nextInt();

		Commodity storage = new Commodity(productName, lengthProduct, widthProduct, weightProduct);

		commodity.add(storage);
		System.out.println();
		System.out.println("Commodity is added!!!");
		System.out.println();
		System.out.println("Storage after added: ");
		System.out.println();
		
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}
		
	}

	public void removeCommodity() {

		System.out.println("Enter name commodity to removing: ");
		String nameToRemove = sc.next();

		Iterator<Commodity> iterator = commodity.iterator();
		while (iterator.hasNext()) {
			Commodity next = iterator.next();

			if (next.getProductName().equalsIgnoreCase(nameToRemove)) {
				iterator.remove();
				System.out.println();
				System.out.println("Commodityis removing!!!");
				System.out.println();
			} 
		}
		
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}

	}

	public void replaceCommdity() {

		removeCommodity();
		addCommodity();
					
	}
	
	public void sortByName() {
		Set<Commodity> storageCommodity = new TreeSet<Commodity>(new StorageSortName());
		storageCommodity.addAll(commodity);
		
		for (Commodity commodity2 : storageCommodity) {
			System.out.println(commodity2);
		}
	}
	
	public void sortByLength() {
		Set<Commodity> storageCommodity = new TreeSet<Commodity>(new StorageSortLength());
		storageCommodity.addAll(commodity);
		
		for (Commodity commodity2 : storageCommodity) {
			System.out.println(commodity2);
		}
	}
	
	public void sortByWidth() {
		Set<Commodity> storageCommodity = new TreeSet<Commodity>(new StorageSortWidth());
		storageCommodity.addAll(commodity);
		
		for (Commodity commodity2 : storageCommodity) {
			System.out.println(commodity2);
		}
	}
	
	public void sortByWeigth() {
		Set<Commodity> storageCommodity = new TreeSet<Commodity>(new StorageSortWeigth());
		storageCommodity.addAll(commodity);
		
		for (Commodity commodity2 : storageCommodity) {
			System.out.println(commodity2);
		}
	}

}
