package pkg20wrappercls;

public class JP01WrapperClassDemo {

	public static void main(String[] args) {
		
		// Convert primitive to wrapper class objects
		int iPrim = 10;
		int iPrimRev;
		
		//Integer iObj = Integer.valueOf(iPrim);		
		//System.out.println(iObj);
		
		Integer iObj = iPrim;   // Autoboxing
		System.out.println(iObj);
		
		
		// Convert from wrapper to primitive types
//		iPrimRev = iObj.intValue();
//		System.out.println(iPrimRev);
		
		iPrimRev = iObj;  // Unboxing
		System.out.println(iPrimRev);
	}
}
