package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceEstimationTest {

	@Test
	public void test1() {
		String item="milk";
		int quantity=5;
		long amount=GroceryAppPriceEstimation.priceEstimation(item,quantity);
		assertEquals(55,amount);
	}
	@Test
	public void test2() {
		String item="bread";
		int quantity=6;
		long amount=GroceryAppPriceEstimation.priceEstimation(item,quantity);
		assertNotEquals(200,amount);
	}

}
