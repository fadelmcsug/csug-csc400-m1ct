package bagpack;

public class BagUse {

	public static void main(String[] args) {
		// creating new bag of type string
		Bag<String> bag = new Bag<>();
		
		// filling bag with numbered string items
		bag.add("item1");
		bag.add("item1");
		bag.add("item3");
		bag.add("item5");
		bag.add("item3");
		bag.add("item2");
		bag.add("item7");
		bag.add("item8");
		bag.add("item6");
		bag.add("item5");
		bag.add("item3");
		
		// printing bag contents
		bag.printContents();
		
		// checking if bag contains items
		bag.contains("item2");
		bag.contains("item3");
		bag.contains("item6");
		bag.contains("item1");
		
		// counting items in bag
		bag.count("item2");
		bag.count("item3");
		bag.count("item6");
		bag.count("item1");
		
		// removing item from bag
		bag.remove("item1");
		
		// printing bag contents
		bag.printContents();
		
		// checking for existence of removed item in bag
		bag.contains("item1");
		
		// counting removed item in bag
		bag.count("item1");
	}

}
