import java.util.Scanner;

public class AdminLoginSuccess {

	public static void adminMainMenu() {
		
		Scanner scanOption = new Scanner(System.in);
		int iOption = 0;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> ADMIN MENU <<<<<<<<<<<<<<<<<<<<<<<");
		do {

			System.out.println("Please select an option from below:");
			System.out.println("1. Add Libraian");
			System.out.println("2. Edit Libraian");
			System.out.println("3. View Libraian");
			System.out.println("4. Delete Libraian");
			System.out.println("0. Exit Application");
			
			System.out.print("Enter Option: ");
			iOption = scanOption.nextInt();
			
			switch(iOption) {
			
				case 1: AddLibrarian.addLibrarianForm();
						break;
						
				case 2: EditLibrarian.editLibrarianDetails();
						break;
						
				case 3: ViewLibrarian.viewLibrarianDetails();
						break;
						
				case 4: DeleteLibrarian.deleteLibrarianDetails();
						break;
				
				case 0: System.out.println("Closing the Application...");
						System.exit(0);
						break;
						
				default: System.out.println("Please choose option from given list.");
			
			}
			
		} while(true);
	}
}
