package pkg04scanner;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		
		Scanner rdIn = new Scanner(System.in);
		System.out.println("Enter name: ");
		
		String name = rdIn.nextLine();
		System.out.println("Username is: " + name);
		
		rdIn.close();
	}
}
