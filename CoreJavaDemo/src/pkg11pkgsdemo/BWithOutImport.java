package pkg11pkgsdemo;

public class BWithOutImport {

	public static void main(String[] args) {		
		
		// package.Class => fully qualified name
		pkg11pack1.A aObj = new pkg11pack1.A();
		
		java.util.Scanner scan = new java.util.Scanner(System.in);		
		
		aObj.display();
	}
}
