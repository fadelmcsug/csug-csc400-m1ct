package bagpack;

import java.util.List;
import java.util.ArrayList;

public class Bag<T> {
	public List<T> contents;
	
	// creates a new bag instance with its contents stored in an ArrayList instance
	public Bag() {
		contents = new ArrayList<>();
	}
	
	// adds a specified item to the bag contents
	public void add(T item) {
		System.out.println(item + " added to bag.");
		contents.add(item);
	}
	
	// removes a specified item to the bag contents
	public void remove(T item) {
		System.out.println(item + " removed from bag.");
		contents.remove(item);
	}
	
	// checks if the bag contains the specified item
	public boolean contains(T item) {
		boolean contains = contents.contains(item);
		if (contains) {
			System.out.println(item + " is in the bag.");
		} else {
			System.out.println(item + " is not in the bag.");
		}
		return contains;
	}
	
	// gives the amount of specified items in the bag
	public int count(T item) {
		int amount = 0;
		for (T c : contents) {
			if (c.equals(item)) {
				amount++;
			}
		}
		switch (amount) {
		case 0:
			System.out.printf("There are no %ss in the bag.\n", item);
			break;
		case 1:
			System.out.printf("There is 1 %s in the bag.\n", item);
			break;
		default:
			System.out.printf("There are %d %ss in the bag.\n", amount, item);
			break;
		}
		return amount;
	}
	
	// prints the contents of the bag
	public void printContents() {
		System.out.println("The bag contains: " + contents);
	}
	
}
