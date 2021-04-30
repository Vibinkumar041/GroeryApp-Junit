package grocery_Management;

import java.util.HashMap;

public class GroceryAppPriceEstimation {
	static HashMap<String,Integer> grocery =new HashMap<String,Integer>();
 	static{
 	grocery.put("milk",20);
	grocery.put("bread",30);
	grocery.put("biscuit",50);
 	}
 	/**
 	 * This method is used to calculate the price of the item with respect to the ordered quantity available in the inventory.
 	 * @param item
 	 * @param quantity
 	 * @return
 	 */
public static long priceEstimation(String item,int quantity) {
	
	if(item=="milk") {
		int milkPrice=11;
		int amount=milkPrice*quantity;
		return amount;
	}
	else if(item=="bread"){
		int breadPrice=35;
		int amount=breadPrice*quantity;
		return amount;
	}
	else if(item=="biscuit"){
		int breadPrice=15;
		int amount=breadPrice*quantity;
		return amount;
	}
	return 0;
}
}
