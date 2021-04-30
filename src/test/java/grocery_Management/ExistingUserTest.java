package grocery_Management;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExistingUserTest {

	@Test
	public void test1() {
		String MobileNumber="9578786366";
		String password="lingam";
		boolean exist=GroceryAppCheckExistingUser.checkExistingUser(MobileNumber, password);
		assertTrue(exist);
	}
	@Test
	public void test2() {
		String MobileNumber="9578786367";
		String password="lingam";
		boolean exist=GroceryAppCheckExistingUser.checkExistingUser(MobileNumber, password);
		assertFalse(exist);
	}

}
