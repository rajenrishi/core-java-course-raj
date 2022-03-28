import java.util.Scanner;

public class EditLibrarian {
	
	public static void editLibrarianDetails () {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>> EDIT LIBRARIAN <<<<<<<<<<<<<<<<<<<<<<<");
		
		Scanner scanLibnDetails = new Scanner(System.in);
		
		System.out.print("Enter Librarian Personal ID: ");
		int iLibID = scanLibnDetails.nextInt();
		
		System.out.print("Enter new Password: ");
		String strPassword = scanLibnDetails.next();
		System.out.print("Enter new Email: ");
		String strEmail = scanLibnDetails.next();
		System.out.print("Enter new Address: ");
		String strAddress = scanLibnDetails.next();
		System.out.print("Enter new City: ");
		String strCity = scanLibnDetails.next();
		System.out.print("Enter new Contact Number: ");
		String strContact = scanLibnDetails.next();
		
		int i=LibrarianDBOperations.update(iLibID, strPassword, strEmail, strAddress, strCity, strContact);
		if(i>0) {
			
			AdminLoginSuccess.adminMainMenu();
			
		} else {
			
			System.out.println("Sorry, unable to update!");
		}
		
		scanLibnDetails.close();
	}
}
