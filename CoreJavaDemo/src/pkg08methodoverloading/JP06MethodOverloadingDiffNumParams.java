package pkg08methodoverloading;

class MODiffNumParams {
	
	// <access specifier> <return type> <method name>
	public int addNumbers(int a, int b) {
		
		System.out.println("We are in add two integers method.");
		return a + b;
	}
	
	public int addNumbers(int a, int b, int c) {
		
		System.out.println("We are in add three integers method.");
		return a + b + c;
	}
}

public class JP06MethodOverloadingDiffNumParams {

	public static void main(String[] args) {
		
		int sum = 0;
		
		MODiffNumParams demoRef = new MODiffNumParams();

		sum = demoRef.addNumbers(10, 12);
		System.out.println(sum);
		sum = demoRef.addNumbers(10, 12, 15);
		System.out.println(sum);
	}
}
