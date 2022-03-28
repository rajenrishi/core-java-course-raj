package pkg05loops;

public class JP008ContinueStatementDemo {

	public static void main(String[] args) {
		
		int count = 0;
			
		while(count <= 10) {
//			System.out.println("in while");
			count++;
			if(count > 4) {
//				System.out.println("Before break");
				continue;
			}
//			System.out.println("after if");
			System.out.println(count);
		}
		// Here
	}
}
