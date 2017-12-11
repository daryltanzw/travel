package sg.bizplus.views.authentification;

public class AuthentificationService {
	public static final String FAILURE = "Failure";
	public static final String SUCCESS = "Success";
	
	public static String getUserRole(String emailId) {
//		User user =  databaseDS.getUser(emailId);
//		return user.getRole();
		return "";
	}
	
	public static String authenticateUser(String emailId) {
		/*if user exists -> set session email
		 * else return "Failure"
		 * */
		return FAILURE;
	}

}
