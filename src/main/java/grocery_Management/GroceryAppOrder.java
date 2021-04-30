package grocery_Management;

import java.util.HashMap;

public class GroceryAppOrder {
	static HashMap<String,Integer> grocery=new HashMap<String,Integer>();
	static{
		grocery.put("milk", 50);
		grocery.put("tea", 30);
		grocery.put("bread", 10);
	}
	/**
	 * This method is used to order the item with quantity , then the quantity of the existing item will get reduce with respect to the ordered quantity.
	 * @param item
	 * @param quantity
	 * @return
	 */
public static HashMap<String,Integer> order(String item,Integer quantity){
	if(grocery.containsKey(item)) {
		int actualQuantity=grocery.get(item);
		if(actualQuantity>quantity) {
		int afterQuantity=actualQuantity-quantity;
		grocery.put(item, afterQuantity);
		}
}
	return grocery;
}
}
