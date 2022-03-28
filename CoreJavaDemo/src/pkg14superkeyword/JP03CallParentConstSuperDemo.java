package pkg14superkeyword;

// accessing the parent class method using super keyword
class CPCSD {
	
	String name;
	
	CPCSD(String nme) {
		
		name = nme;
	}
}

public class JP03CallParentConstSuperDemo extends CPCSD {
	
	String name;
	
	public JP03CallParentConstSuperDemo(String nme1, String nme2) {
		
		super(nme1);
		this.name = nme2;
	}
	
	public void display() {
		
		System.out.println(super.name + "  " + name);
	}

	public static void main(String[] args) {
		
		JP03CallParentConstSuperDemo obj = new JP03CallParentConstSuperDemo("Super", "Sub");
		
		obj.display();
	}
}
