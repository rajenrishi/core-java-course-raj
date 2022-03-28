import java.util.Scanner;

public class LibrarianLogin {
	
	public static void libnLoginConsole() {
		
		String strLibnUserName;
		String strLibnPassword;
		int iActualAttempts = 0;
		
		Scanner scanLibnCred = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> ADMIN LOGIN PAGE <<<<<<<<<<<<<<<<<<<<<");
		
		do {
			System.out.print("Enter Librarian Name: ");
			strLibnUserName = scanLibnCred.next();
			System.out.print("Enter Librarian Password: ");
			strLibnPassword = scanLibnCred.next();
			
			// Validate the credentials
			boolean isValidLibn = LibrarianDBOperations.validate(strLibnUserName, strLibnPassword);
			if(isValidLibn) {
				
				LibnLoginSuccess.libnMainMenu();
				break;
			
			} else {
				iActualAttempts++;
				if(iActualAttempts == 1) {
					
					System.out.println("Incorrect Username or password!\n2 attempts remaining.");
				
				} else if(iActualAttempts == 2) {
					
					System.out.println("Incorrect Username or password!\n1 attempt remaining.");
				
				} else if(iActualAttempts == 3) {
					
					System.out.println("Incorrect Username or password!\nLast attempt.");
					System.out.println("Closing the application.");
					System.exit(0);
				}
			}
			
		} while(true);
		
	}
}
