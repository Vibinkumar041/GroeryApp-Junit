package grocery_Management;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class AddQuantityTest {
	@Test
	public void test1() {
		String item="bread";
		int quantity=10;
		HashMap<String,Integer>grocery;
		grocery=GroceryAppAddQuantity.addQuantity(item, quantity);
		int check = grocery.get(item);
		assertEquals(40,check);
	}
	@Test
	public void test2() {
		String item="bread";
		int quantity=10;
		HashMap<String,Integer>grocery;
		grocery=GroceryAppAddQuantity.addQuantity(item, quantity);
		int check = grocery.get(item);
		assertNotEquals(50,check);
	}
	}
