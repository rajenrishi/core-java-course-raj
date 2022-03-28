package pkg12inheritance;

class CMA {
	
	CMA() {
		
		System.out.println("In CMA constructor.");
	}
	
	public void displayMA() {
		
		System.out.println("In CMA display method.");
	}
}

class CMB extends CMA {
	
	CMB() {
		
		System.out.println("In CMB constructor.");
	}
	
	public void displayMB() {
		
		System.out.println("In CMB display method.");
	}
}

public class JPInheritanceConstChain extends CMB {
	
	JPInheritanceConstChain() {
		
		System.out.println("In JPMultilevelInheritance constructor.");
	}

	public static void main(String[] args) {
		
		JPInheritanceConstChain bObj = new JPInheritanceConstChain();
		bObj.displayMA();
		bObj.displayMB();
	}
}
