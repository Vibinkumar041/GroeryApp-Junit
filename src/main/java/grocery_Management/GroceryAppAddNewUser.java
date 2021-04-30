package grocery_Management;

import java.util.HashMap;

public class GroceryAppAddNewUser {
	static HashMap<String,String> userDetails=new HashMap<String,String>();
	static {
		userDetails.put("9578786367","siva");
		userDetails.put("9578786366","lingam");
	}
	/**
	 * This method is used to add the userlist to the HashMap list. 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static HashMap<String,String> AddUser(String mobileNumber,String password) {
		userDetails.put(mobileNumber, password);
		return userDetails;
		
	}
}