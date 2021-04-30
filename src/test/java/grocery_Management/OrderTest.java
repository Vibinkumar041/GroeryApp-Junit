package grocery_Management;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class OrderTest {

	@Test
	public void test1() {
		String item="milk";
		int quantity=20;
		HashMap<String,Integer>grocery=new HashMap<String,Integer>();
		grocery=GroceryAppOrder.order(item, quantity);
		int check = grocery.get(item);
		assertEquals(30,check);
	}
	@Test
	public void test2() {
		String item="milk";
		int quantity=20;
		HashMap<String,Integer>grocery=new HashMap<String,Integer>();
		grocery=GroceryAppOrder.order(item, quantity);
		int check = grocery.get(item);
		assertNotEquals(50,check);
	}

}
