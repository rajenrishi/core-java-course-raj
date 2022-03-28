package pkg05loops;

public class JP009ContinueStmntNestedLoopDemo {

	public static void main(String[] args) {
		
		int inCount = 1;
		int outCount = 1;
			
		while(outCount <= 10) {

			inCount = 0;
			
			while (inCount <= 5) {
				
				inCount++;
				if(inCount > 2) {
					continue;
				}
				System.out.println(">>>>>>>>> Inner loop: " + inCount);
				
			}
			outCount++;	
			if(outCount > 2) {
				continue;
			}
			System.out.println("Outer loop: " + outCount);
		}
	}
}
