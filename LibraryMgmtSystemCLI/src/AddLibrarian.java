import java.util.Scanner;

public class AddLibrarian {
	
	final static int ADD_LIB_OPTIONS_COUNT = 8;
	
	public static void addLibrarianForm() {

		boolean isValidInput = false;
		int iCounter = 0;
		int iAttempts = 0;
		final int MAX_ATTEMPTS = 3;
		Scanner scanLibnDetails = new Scanner(System.in);
		String strEnterAgain = "";
		
		String strName = "";
		String strPassword = "";
		int iAge = 0;
		int iPersonalID = 0;
		String strEmail = "";
		String strAddress = "";
		String strCity = "";
		String strContact = "";
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> ADD LIBRARIAN <<<<<<<<<<<<<<<<<<<<<");
		
		do {
			isValidInput = false;
			switch(iCounter) {

				case 0: System.out.print("Enter Name " + strEnterAgain + ":");
						strName = scanLibnDetails.next();
						isValidInput = LibraryUtility.verifyName(strName);
						if(isValidInput) { 
							iCounter++; 
							iAttempts = 0;
							strEnterAgain = "";
						} else { 
							strEnterAgain = "again";
							System.out.print("Entered Name is invalid.\n   ");
							iAttempts++; 
						};
						break;
						
				case 1: System.out.println("\nPassword Rules:");
						System.out.println("==> Minimum length should be 5 characters.");
						System.out.println("==> Should have atleast one upper case, one lowercase and one number.");
						System.out.println("==> Special characters and spaces are not allowed.\n");
						System.out.print("Enter Password " + strEnterAgain + ":");
						strPassword = scanLibnDetails.next();
						isValidInput = LibraryUtility.verifyPassword(strPassword);
						if(isValidInput) { 
							iCounter++; 
							iAttempts = 0;
							strEnterAgain = "";
						} else { 
							strEnterAgain = "again";
							System.out.print("Entered Password is invalid.\n   ");
							iAttempts++;
						};
						break;
						
				case 2: System.out.print("Enter Age " + strEnterAgain + ":");
						iAge = scanLibnDetails.nextInt();
						isValidInput = true; // no validation required
						if(isValidInput) { 
							iCounter++; 
							iAttempts = 0;
							strEnterAgain = "";
						} else { 
							System.out.print("Entered Age is invalid.\n ");
							iAttempts++;
						};
						break;
						
				case 3: System.out.print("Enter Personal ID " + strEnterAgain + ":");
						iPersonalID = scanLibnDetails.nextInt();
						isValidInput = true; // no validation required
						if(isValidInput) { 
							iCounter++; 
							iAttempts = 0;
						} else { 
							strEnterAgain = "again";
							System.out.print("Entered Personal ID is invalid.\n   ");
							iAttempts++;
						};
						break;
						
				case 4: System.out.print("Enter Email " + strEnterAgain + ":");
						strEmail = scanLibnDetails.next();
						isValidInput = LibraryUtility.verifyEmail(strEmail);
						if(isValidInput) { 
							iCounter++; 
							iAttempts = 0;
							strEnterAgain = "";
						} else { 
							strEnterAgain = "again";
							System.out.print("Entered Email is invalid.\n   ");
							iAttempts++;
						};
						break;
						
				case 5: System.out.print("Enter Address " + strEnterAgain + ":");
						strAddress = scanLibnDetails.next();
						isValidInput = true; // no validation required
						if(isValidInput) { 
							iCounter++; 
							iAttempts = 0;
							strEnterAgain = "";
						} else { 
							strEnterAgain = "again";
							System.out.print("Entered Address is invalid.\n   ");
							iAttempts++;
						};
						break;
						
				case 6: System.out.print("Enter City " + strEnterAgain + ":");
						strCity = scanLibnDetails.next();
						isValidInput = LibraryUtility.verifyName(strCity);
						if(isValidInput) { 
							iCounter++; 
							iAttempts = 0;
							strEnterAgain = "";
						} else { 
							strEnterAgain = "again";
							System.out.print("Entered City is invalid.\n   ");
							iAttempts++;
						};
						break;
						
				case 7: System.out.print("Enter Contact (10 digits) " + strEnterAgain + ":");
						strContact = scanLibnDetails.next();
						isValidInput = LibraryUtility.verifyContact(strContact);
						if(isValidInput) { 
							iCounter++; 
							iAttempts = 0;
							strEnterAgain = "";
						} else { 
							strEnterAgain = "again";
							System.out.print("Entered Contact is invalid.\n   ");
							iAttempts++;
						};
						break;
			
			}
			
			if(iCounter == AddLibrarian.ADD_LIB_OPTIONS_COUNT || (!isValidInput && iAttempts == MAX_ATTEMPTS)) {
				
				break;
			}
			
			
			
		} while(true);
		
		if(isValidInput) {
			int i = LibrarianDBOperations.save(strName, strPassword, iAge, iPersonalID, strEmail, strAddress, strCity, strContact);
			if(i > 0) {
				
				AdminLoginSuccess.adminMainMenu();
				
			} else {
				
				System.out.println("Unable to save the librarian details!");
			}
		} else {
			
			System.out.println("Invalid librarian details are entered!");
			System.out.println("Unable to save the librarian details!\n\n");
			AdminLoginSuccess.adminMainMenu();
		}
	}
}
