package grocery_Management;

import java.util.HashMap;

public class GroceryAppDelete {
	static HashMap<String,Integer> grocery=new HashMap<String,Integer>();
	static{
		grocery.put("milk", 15);
		grocery.put("bread",20);
		grocery.put("wheat", 25);
	}
	/**
	 * This method is used to delete the existing item in the inventory.
	 * @param item
	 * @return
	 */
	public static HashMap<String, Integer> delete(String item) {
		
		if (grocery.containsKey(item)) {
			grocery.remove(item);
		}
		return grocery;
		}
}
