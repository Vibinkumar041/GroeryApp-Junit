package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckAdminTest {

	@Test
	public void test1() {
		String mobileNumber="9659644868";
		String password="vibin";
		boolean isAdmin=GroceryAppCheckAdmin.admin(mobileNumber,password);
		assertTrue(isAdmin);
	}
	@Test
	public void test2() {
		String mobileNumber="9659679989";
		String password="vibin";
		boolean isAdmin=GroceryAppCheckAdmin.admin(mobileNumber,password);
		assertFalse(isAdmin);
	}

}
