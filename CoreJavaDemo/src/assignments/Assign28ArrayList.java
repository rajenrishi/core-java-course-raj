/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.ArrayList;
import java.util.Scanner;

//Assignment: 28
//Write a Java program to create an ArrayList of String type. 
//Read two strings from the user. One string is the element and the other string will 
//specify what to do with the string. For example to add or remove or show ArrayList elements. 
//Perform this until string ‘stop’ is entered by the user as action.
//Example Input: 
//Enter element: Java
//Enter action: add
//Enter element: Python
//Enter action: remove

public class Assign28ArrayList {
	
	ArrayList<String> strAL = new ArrayList<>();

	public void addELe(String ele) {
		
		System.out.println("Adding the element.");
		strAL.add(ele);
	}

	public void remELe(String ele) {
		
		System.out.println("Removing the element.");
		strAL.remove(ele);
	}

	public void shwELe() {
		
		System.out.println("Showing the elements.");
		for(String ele : strAL) {
			
			System.out.println(ele);
		}
	}

	public static void main(String[] args) {

		Scanner scanIn = new Scanner(System.in);
		String strAction;
		String strElement;
		Assign28ArrayList alActions = new Assign28ArrayList();
		do {
			
			System.out.print("Enter action: ");
			strAction = scanIn.next();
			
			if(strAction.equals("stop")) {
				
				break;
			}
			
			if(strAction.equals("add")) {
				
				System.out.print("Enter element: ");
				strElement = scanIn.next();
				
				alActions.addELe(strElement);
			
			} else if(strAction.equals("remove")) {
				
				System.out.print("Enter element: ");
				strElement = scanIn.next();

				alActions.remELe(strElement);
				
			} else if(strAction.equals("show")) {

				alActions.shwELe();
			}
			
		} while(true);
	}
}
