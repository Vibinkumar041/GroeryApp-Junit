package grocery_Management;

import java.util.HashMap;

public class GroceryAppAddItem {
	/**
	 * This method is used to add new Item to an inventory.
	 * @param item
	 * @param quantity
	 * @return
	 */
	public static HashMap<String,Integer> addItem(String item,int quantity) {
		HashMap<String,Integer> grocery=new HashMap<String,Integer>();
		grocery.put(item,quantity);
		return grocery;
		}
}
