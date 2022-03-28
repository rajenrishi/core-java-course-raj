package pkg05loops;

public class JP010LabelledContinueStmtDemo {

	public static void main(String[] args) {
		
		int inCount = 1;
		int outCount = 0;
		
		outLoop:
		while(outCount <= 10) {

			outCount++;
			inCount = 0;
			while (inCount <= 5) {
				
				inCount++;
				if(outCount > 2) {
					continue outLoop;
				}
				System.out.println(">>>>>>>>> Inner loop: " + inCount);
				
			}
			System.out.println(">>>>>>>>> Outer loop: " + outCount);
		}
	}
}
