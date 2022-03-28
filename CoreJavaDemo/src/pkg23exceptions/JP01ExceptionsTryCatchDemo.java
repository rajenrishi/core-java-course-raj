package pkg23exceptions;

public class JP01ExceptionsTryCatchDemo {

	public static void main(String[] args) {

		int iVal = 10;
		int iRes = 0;
		int[] nums = {1, 2, 3, 2};
		
		try {
			
//			iRes = iVal/0;  // Division by zero
			System.out.println("Inside try block.");
			
			System.out.println("Access array element: " + nums[5]);
			
		} catch(ArithmeticException e) {
			
			System.out.println("Inside catch block.");
		
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Inside catch array block.");
		
		} finally {
		
			System.out.println("Inside finally block.");
		}
	}
}
