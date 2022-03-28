package pkg12inheritance;


class HA {
	
	public void displayHA() {
		
		System.out.println("In HA display method.");
	}
}

class HB extends HA {
	
	public void displayHB() {
		
		System.out.println("In HB display method.");
	}
}

public class JPHierarchialInheritance extends HA {

	public static void main(String[] args) {

		
		JPHierarchialInheritance obj = new JPHierarchialInheritance();
		obj.displayHA();
	}

}
