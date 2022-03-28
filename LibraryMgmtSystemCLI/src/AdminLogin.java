import java.util.Scanner;

public class AdminLogin {
	
	static AdminLogin adminLogin;
	
	public static void adminLoginConsole() {
		
		String strAdminUserName;
		String strAdminPassword;
		int iActualAttempts = 0;
		
		Scanner scanAdminCred = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> ADMIN LOGIN PAGE <<<<<<<<<<<<<<<<<<<<<");
		
		do {
			System.out.print("Enter Admin Username: ");
			strAdminUserName = scanAdminCred.next();
			System.out.print("Enter Admin Password: ");
			strAdminPassword = scanAdminCred.next();
			
			// Validate the credentials
			if(strAdminUserName.equals("admin") && strAdminPassword.equals("admin123")) {
				
				AdminLoginSuccess.adminMainMenu();
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
		
		scanAdminCred.close();
	}

	public static void main(String[] args) {

		adminLogin = new AdminLogin();
	}
}
