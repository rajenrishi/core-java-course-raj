import java.util.Scanner;

public class AddBooks {
	
	public static void addBooksForm() {
		
		Scanner scanBookDetails = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> ADD BOOKS <<<<<<<<<<<<<<<<<<<<<");

		System.out.print("Enter Call Number: ");
		String strCallNo = scanBookDetails.next();
		
		System.out.print("Enter Name: ");
		String strName = scanBookDetails.next();
		
		System.out.print("Enter Author Name: ");
		String strAuthor = scanBookDetails.next();
		
		System.out.print("Enter Publisher: ");
		String strPublisher = scanBookDetails.next();
		
		System.out.print("Enter Quantity: ");
		int iQuantity = scanBookDetails.nextInt();
		
		int i = BookDBOperations.save(strCallNo, strName, strAuthor, strPublisher, iQuantity);
		if(i > 0) {
			
			LibnLoginSuccess.libnMainMenu();
			
		} else {
			
			System.out.println("Sorry, unable to save!");
		}
	}
}
