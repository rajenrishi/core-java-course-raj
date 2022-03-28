package pkg02operators;

public class TernaryOperatorsDemo {

	public static void main(String[] args) {
	    // ternary operator checks if
	    // marks is greater than 40
//	    double marks = 30.0d;
//	    String result = (marks > 40) ? "pass" : "fail";
//	    System.out.println("You " + result + " the exam.");
	    
//	    int iTest = 10;
//	    int result = (iTest > 15) ? ++iTest : --iTest;
//	    System.out.println(result);
		
		
		// Nested ternary statements
		int n1 = 2;
		int n2 = 9;
		int n3 = -1;
		
		int ln = (n1 > n2) ?  ((n1 > n3) ? n1 : n3)   :  ((n2 > n3) ? n2 : n3);
		
		 //  false   ?   exp1 is not executed :    9   >  -1 ==> true? 9
		
		
		System.out.println(ln);
		
	}
}
