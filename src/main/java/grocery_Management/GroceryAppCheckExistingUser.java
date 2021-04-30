package grocery_Management;

import java.util.HashMap;

public class GroceryAppCheckExistingUser {
		static HashMap<String,String> userDetails=new HashMap<String,String>();
		static {
			userDetails.put("9578786367","siva");
			userDetails.put("9578786366","lingam");
		}
		/**
		 * To Check whether the user is an existing one or not, by checking their mobilenumber with password.
		 * @param mobileNumber
		 * @param password
		 * @return
		 */
		public static boolean checkExistingUser(String mobileNumber,String password) {
			boolean exist=false;
			if(userDetails.containsKey(mobileNumber)){
				if(userDetails.get(mobileNumber)==password) {
					exist=true;
				}
	}
			return exist;
}
}