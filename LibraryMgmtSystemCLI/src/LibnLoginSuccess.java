import java.util.Scanner;

public class LibnLoginSuccess {

	public static void libnMainMenu() {
		
		Scanner scanOption = new Scanner(System.in);
		int iOption = 0;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> LIBRARIAN MENU <<<<<<<<<<<<<<<<<<<<<<<");
		do {

			System.out.println("Please select an option from below:");
			System.out.println("1. Add Books");
			System.out.println("2. View Books");
			System.out.println("3. Issue Book");
			System.out.println("4. View Issued Books");
			System.out.println("5. Return Book");
			System.out.println("0. Exit Application");
			
			System.out.print("Enter Option: ");
			iOption = scanOption.nextInt();
			
			switch(iOption) {
			
				case 1: AddBooks.addBooksForm();
						break;
						
				case 2: ViewBooks.viewBooks();
						break;
						
				case 3: IssueBookForm.issueBookDetails();
						break;
						
				case 4: ViewIssuedBooks.viewIssuedBooks();
						break;
						
				case 5: ReturnBook.returnBook();
						break;
				
				case 0: System.out.println("Closing the Application...");
						System.exit(0);
						break;
						
				default: System.out.println("Please choose option from given list.");
			}
			
		} while(true);
	}
}
