package ua.yaremechko.set.example1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		Set<Human> human = new HashSet<>();
		human.add(new Human("Roman", 21));
		human.add(new Human("Andrew", 23));
		human.add(new Human("Roman", 21));
		human.add(new Human("Ivan", 27));
		human.add(new Human("Roman", 22));

		System.out.println("Before Sorting: ");
		for (Human human2 : human) {
			System.out.println(human2);
		}
		System.out.println();
		System.out.println("After Sorting Comparable: ");
		
		Set<Human> humanSortComparable = new TreeSet<>();
		humanSortComparable.add(new Human("Roman", 21));
		humanSortComparable.add(new Human("Andrew", 23));
		humanSortComparable.add(new Human("Roman", 21));
		humanSortComparable.add(new Human("Ivan", 27));
		humanSortComparable.add(new Human("Roman", 22));
		
		for (Human human2 : humanSortComparable) {
			System.out.println(human2);
		}
		System.out.println();
		System.out.println("After Sorting Comparator: ");
		Set<Human> humanSortComparator = new TreeSet<Human>(new HumanComparator());
		humanSortComparator.add(new Human("Roman", 21));
		humanSortComparator.add(new Human("Andrew", 23));
		humanSortComparator.add(new Human("Roman", 21));
		humanSortComparator.add(new Human("Ivan", 27));
		humanSortComparator.add(new Human("Roman", 22));
		
		for (Human human2 : humanSortComparator) {
			System.out.println(human2);
		}
	}
	
}
