package grocery_Management;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class DeleteTest {

	@Test
	public void test1() {
		String item="milk";
		HashMap<String,Integer> grocery=GroceryAppDelete.delete(item);
		assertFalse(grocery.containsKey("milk"));
	}
	@Test
	public void test2() {
		String item="wheat";
		HashMap<String,Integer> grocery=GroceryAppDelete.delete(item);
		assertTrue(grocery.containsKey("bread"));
	}

}
