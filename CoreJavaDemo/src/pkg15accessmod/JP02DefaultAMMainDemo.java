package pkg15accessmod;

import pkg15accessmodpack.*;

class DefA {   // Default modifier
	
	int data = 30;
	
	void display() {
		
		System.out.println("In default method Class DefA: " + data);
	}
}

public class JP02DefaultAMMainDemo {

	public static void main(String[] args) {
		
		// Same class default class, method and variable
		DefA aObj = new DefA();
		aObj.display();

		// Diff class default class, method and variable
		DefDiffClassA defDiffObj = new DefDiffClassA();
		defDiffObj.display();

		// Diff package default class, method and variable
//		DefDiffPkgA defDiffPkgObj = new DefDiffPkgA();    // Compile Error
//		defDiffPkgObj.display();

	}
}
