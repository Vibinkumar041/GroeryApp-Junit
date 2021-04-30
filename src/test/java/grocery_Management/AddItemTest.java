package grocery_Management;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class AddItemTest {

	@Test
	public void test1() {
		String item="rice";
		int price=50;
		HashMap<String,Integer> grocery=GroceryAppAddItem.addItem(item, price);
		assertTrue(grocery.containsKey("rice"));
	}
	@Test
	public void test2() {
		String item="butter";
		int price=30;
		HashMap<String,Integer> grocery=GroceryAppAddItem.addItem(item, price);
		assertFalse(grocery.containsKey("wheat"));
	}

}
