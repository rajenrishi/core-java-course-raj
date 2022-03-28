import java.util.Scanner;

import javax.swing.JOptionPane;

public class IssueBookForm {

	public static void issueBookDetails() {
		
		Scanner scanBookDetails = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> ISSUE BOOK <<<<<<<<<<<<<<<<<<<<<");

		System.out.print("Enter Call Number: ");
		String strCallNo = scanBookDetails.next();
		
		System.out.print("Enter Borrower Name: ");
		String strName = scanBookDetails.next();
		
		System.out.print("Enter Borrower ID: ");
		int iID = scanBookDetails.nextInt();
		
		System.out.print("Enter Borrower Contact: ");
		String strContact = scanBookDetails.next();

		if(IssueBookDBOperations.checkBookAvailability(strCallNo)) {
			
			int i = IssueBookDBOperations.save(strCallNo, iID, strName, strContact);
			if(i > 0) {
				
				LibnLoginSuccess.libnMainMenu();
				
			} else {
				
				System.out.println("Given book is not available!");
			}
			
		} else {
			
			System.out.println("Call Number does not exist!");
		}
	}
}
