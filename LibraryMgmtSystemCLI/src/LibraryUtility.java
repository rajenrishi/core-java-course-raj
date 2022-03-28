import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LibraryUtility {

	final static int PWD_MIN_LENGTH = 5;
	final static int CONTACT_MIN_LENGTH = 10;

	public static void main(String[] args) {
		
		// This method is for validation and trial and error purpose
		
//		Pattern pattern = Pattern.compile("[a-z0-9]+@[a-z0-9]+.[a-z]+", Pattern.CASE_INSENSITIVE);
//		Matcher matcher = pattern.matcher("asdf@sdf.com");
//		Pattern pattern = Pattern.compile("^[a-zA-Z]+$", Pattern.CASE_INSENSITIVE);
//		Matcher matcher = pattern.matcher("Rajenddfra");
//		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,}$");
//		Matcher matcher = pattern.matcher("AsodhutyA23");
		Pattern pattern = Pattern.compile("^[0-9]{10}$");
		Matcher matcher = pattern.matcher("123456789");
		
		boolean matchFound = matcher.find();
		System.out.println(matchFound);
		
	}
	
	public static boolean verifyName(String name) {
		
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(name);
		
		boolean matchFound = matcher.find();
		
		return matchFound;
	}
	
	public static boolean verifyPassword(String password) {
		
		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\\\S+$).{5,}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(password);
		
		boolean matchFound = matcher.find();

		return matchFound;
	}
	
	public static boolean verifyEmail(String email) {

		Pattern pattern = Pattern.compile("[a-z0-9]+@[a-z0-9]+.[a-z]+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		
		boolean matchFound = matcher.find();

		return matchFound;
	}
	
	public static boolean verifyContact(String contact) {
		
		Pattern pattern = Pattern.compile("^[0-9]{10}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(contact);
		
		boolean matchFound = matcher.find();

		return matchFound;
	}
}
