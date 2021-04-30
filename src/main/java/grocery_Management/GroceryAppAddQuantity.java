package grocery_Management;

import java.util.HashMap;

public class GroceryAppAddQuantity {
	/**
	 * This method is used to add the quantity to the existing item in the inventory.
	 * @param item
	 * @param quantity
	 * @return
	 */
public static HashMap<String,Integer> addQuantity(String item,int quantity){
	HashMap<String,Integer> grocery =new HashMap<String,Integer>();
	 	grocery.put("milk",20);
		grocery.put("bread",30);
		grocery.put("biscuit",50);
		int actualQuantity=grocery.get(item);
		int afterQuantity=actualQuantity+quantity;
		grocery.put(item, afterQuantity);
	return grocery;
}
}
