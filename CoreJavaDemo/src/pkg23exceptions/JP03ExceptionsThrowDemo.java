package pkg23exceptions;

public class JP03ExceptionsThrowDemo {
	
	static void divideByZero() {
		
		throw new ArithmeticException("Trying to divide by zero.");
	}

	public static void main(String[] args) {
		
//		try {
			
			divideByZero();
		
//		} catch(Exception e) {
//			
//			System.out.println("File is not found.");
//		}
	}
}
