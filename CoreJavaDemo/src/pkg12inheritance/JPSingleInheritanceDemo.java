// Single inheritance
package pkg12inheritance;


class A {
	
	public void display() {
		
		System.out.println("In class A display.");
	}
}


public class JPSingleInheritanceDemo extends A {

	public static void main(String[] args) {
		
		JPSingleInheritanceDemo bObj = new JPSingleInheritanceDemo();
		bObj.display();
	}
}
