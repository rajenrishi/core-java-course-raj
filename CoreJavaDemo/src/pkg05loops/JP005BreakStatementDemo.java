package pkg05loops;

public class JP005BreakStatementDemo {

	public static void main(String[] args) {
		
		int count = 1;
			
		while(count <= 10) {

			System.out.println(count);
			if(count == 4) {
				System.out.println("Before break");
				break;
			}
			System.out.println("after if");
			count++;
		}
		// Here
	}
}
