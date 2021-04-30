package grocery_Management;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class AdduserTest {

	@Test
	public void test1() {
		String mobileNumber="9524977676";
		String password="mithun";
		HashMap<String,String> userDetails=GroceryAppAddNewUser.AddUser(mobileNumber, password);
		assertTrue(userDetails.containsKey(mobileNumber));
	}
	@Test
	public void test2() {
		String mobileNumber="9524977676";
		String password="mithun";
		HashMap<String,String> userDetails=GroceryAppAddNewUser.AddUser(mobileNumber, password);
		assertFalse(userDetails.containsKey("9524977675"));
	}

}
