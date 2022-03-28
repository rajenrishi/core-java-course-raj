import java.util.Scanner;

public class LibraryHome {
	
	static LibraryHome library;
	
	public LibraryHome() {
		
		int iOption = 0;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> LIBRARY MANAGEMENT SYSTEM <<<<<<<<<<<<<<<<<<<<<");
		
		Scanner scanOption = new Scanner(System.in);

		do {
			System.out.println("Please select an option from Main Menu.");
			System.out.println("1. Admin Console");
			System.out.println("2. Librarian Console");
			System.out.println("0. Exit Application");
			
			System.out.print("Enter option: ");
			iOption = scanOption.nextInt();
			switch(iOption) {
				
				case 1: // Display admin login 
						AdminLogin.adminLoginConsole();
						break;
					
				case 2: // Display librarian login
						LibrarianLogin.libnLoginConsole();
						break;
					
				case 0: // Exit the application
						System.out.println("Closing the application.");
						System.exit(0);
				
				default: System.out.print("Invalid option. ");
						break;
			}
		} while(true);
	}

	public static void main(String[] args) {
		
		library = new LibraryHome();
		
	}
}
