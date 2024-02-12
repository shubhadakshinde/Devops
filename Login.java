package login.logic;

import java.util.ResourceBundle;

public class Login {
	
	public int userLogin(String username, String password) {
		ResourceBundle r= ResourceBundle.getBundle("config");
		String userName = r.getString("uname");
		String passWord = r.getString("passwd");
		
		if(username.equals(userName) && password.equals(passWord)) {
			return 1;
		}
		else
			return 0;
		
	}

}
