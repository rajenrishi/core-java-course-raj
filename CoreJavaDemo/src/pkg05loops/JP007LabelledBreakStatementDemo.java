package pkg05loops;

public class JP007LabelledBreakStatementDemo {

	public static void main(String[] args) {
		
		int inCount = 1;
		int outCount = 1;
		
		outloop:   // labeling the outer loop
		while(outCount <= 10) {

			System.out.println("Outer loop: " + outCount);
			inCount = 0;   // re initializing inner loop counter
			inloop:
			while (inCount <= 5) {
				
				System.out.println(">>>>>>>>> Inner loop: " + inCount);
				if(inCount == 3) {
					
					break inloop;
				}
				inCount++;
			}
			outCount++;	
		}
	}
}
