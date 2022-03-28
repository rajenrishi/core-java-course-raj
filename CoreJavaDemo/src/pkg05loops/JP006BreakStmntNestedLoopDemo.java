package pkg05loops;

public class JP006BreakStmntNestedLoopDemo {

	public static void main(String[] args) {
		
		int inCount = 1;
		int outCount = 1;
			
		while(outCount <= 10) {

			System.out.println("Outer loop: " + outCount);
			inCount = 1;
			
			while (inCount <= 5) {
				
				System.out.println(">>>>>>>>> Inner loop: " + inCount);
				if(inCount == 2) {
					break;
				}
				
				inCount++;
			}
			outCount++;	
		}
	}
}
