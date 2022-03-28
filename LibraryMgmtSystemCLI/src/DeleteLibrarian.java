import java.util.Scanner;

public class DeleteLibrarian {
	
	public static void deleteLibrarianDetails () {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>> DELETE LIBRARIAN <<<<<<<<<<<<<<<<<<<<<<<");
		
		Scanner scanLibnDetails = new Scanner(System.in);
		
		System.out.print("Enter Librarian Personal ID: ");
		int iLibID = scanLibnDetails.nextInt();
				
		int i = LibrarianDBOperations.delete(iLibID);
		if(i>0) {
			
			AdminLoginSuccess.adminMainMenu();
			
		} else {
			
			System.out.println("Sorry, unable to delete!");
		}
		
		scanLibnDetails.close();
	}
}
