package pkg12inheritance;

class MA {
	
	MA() {
		
		System.out.println("In MA constructor.");
	}
	
	public void displayMA() {
		
		System.out.println("In MA display method.");
	}
}

class MB extends MA {
	
	MB() {
		
		System.out.println("In MB constructor.");
	}
	
	public void displayMB() {
		
		System.out.println("In MB display method.");
	}
}

public class JPMultilevelInheritance extends MB {
	
	JPMultilevelInheritance() {
		
		System.out.println("In JPMultilevelInheritance constructor.");
	}

	public static void main(String[] args) {
		
		JPMultilevelInheritance bObj = new JPMultilevelInheritance();
		bObj.displayMA();
		bObj.displayMB();
	}
}
