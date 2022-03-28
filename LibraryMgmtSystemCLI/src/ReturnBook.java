import java.util.Scanner;

public class ReturnBook {

	public static void returnBook() {

		Scanner scanBookDetails = new Scanner(System.in);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> RETURN BOOK <<<<<<<<<<<<<<<<<<<<<<<");
		System.out.print("Enter Call Number: ");
		String strCallNo = scanBookDetails.next();
		
		System.out.print("Enter Borrower ID: ");
		int iID = scanBookDetails.nextInt();
		
		int i = ReturnBookDBOperations.delete(strCallNo, iID);
		if(i > 0) {
			
			System.out.println("Book is returned successfully!");
			
		} else {
			
			System.out.println("Unable to return the book!");
		}
	}
}
