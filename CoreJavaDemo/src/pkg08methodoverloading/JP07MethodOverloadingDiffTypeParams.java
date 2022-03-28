package pkg08methodoverloading;

class MODiffTypeParams {
	
	// <access specifier> <return type> <method name>
	public int add(int a, int b) {
		
		System.out.println("We are in add two integers method.");
		return a + b;
	}
	
	public String add(String a, String b) {
		
		System.out.println("We are in add two strings method.");
		return a + b;
	}
}

public class JP07MethodOverloadingDiffTypeParams {

	public static void main(String[] args) {
		
		int sum = 0;
		String resStr = null;
		
		MODiffTypeParams demoRef = new MODiffTypeParams();

		sum = demoRef.add(10, 12);
		System.out.println(sum);
		
		resStr = demoRef.add("Str1", "Str2");
		System.out.println(resStr);
	}
}
