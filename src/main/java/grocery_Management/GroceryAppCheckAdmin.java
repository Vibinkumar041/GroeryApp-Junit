package grocery_Management;

import java.util.ArrayList;

	class Admin {
	public String mobileNumber;
	public String password;
}

public class GroceryAppCheckAdmin {
	static ArrayList<Admin> adminList = new ArrayList<Admin>();
	static {
		Admin admin1 = new Admin();
		admin1.mobileNumber = "9659644868";
		admin1.password = "vibin";
		
		Admin admin2 = new Admin();
		admin2.mobileNumber = "9659679989";
		admin2.password = "kumar";
		adminList.add(admin1);
		adminList.add(admin2);
	}
	/**
	 * This admin method is used to check the admin's login mobilenumber and password.
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
public static boolean admin(String mobileNumber,String password) {
boolean exist=false;
	for(Admin admin:adminList) {
	if(admin.mobileNumber.equalsIgnoreCase(mobileNumber) && admin.password.equals(password)) {
		exist=true;
		break;
	}
}
	return exist;
	
}
}
