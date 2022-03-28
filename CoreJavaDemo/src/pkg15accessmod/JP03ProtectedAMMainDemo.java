package pkg15accessmod;

import pkg15accessmodpack.*;

class ProDefA {
	
	protected int data = 30;
	
	protected void display() {
		
		System.out.println("In default method Class ProDefA: " + data);
	}
}

public class JP03ProtectedAMMainDemo extends JP03ProtectedAMDiffPkgDemo {

	public static void main(String[] args) {
		
		// Same class protected method and protected variable
		ProDefA aObj = new ProDefA();
		aObj.display();

		// Diff class protected method and protected variable
//		ProDiffClassA proMetObj = new ProDiffClassA();
//		proMetObj.display();

		// Diff package protected method and protected variable
//		JP03ProtectedAMDiffPkgDemo proDiffPkgObj = new JP03ProtectedAMDiffPkgDemo();
//		proDiffPkgObj.display();

	}
}
