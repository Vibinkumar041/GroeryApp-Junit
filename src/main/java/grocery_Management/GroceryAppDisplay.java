package grocery_Management;

import java.util.HashMap;

public class GroceryAppDisplay {
	static HashMap<String,Integer> grocery=new HashMap<String,Integer>();
	static{
		grocery.put("milk", 15);
		grocery.put("bread",20);
		grocery.put("wheat", 25);
	}
	/**
	 * This method is used to display the items in the inventory.
	 */
	public static void display() {
		System.out.println("The items are="+grocery);
}
}