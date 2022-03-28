package pkg07classesobjs;

public class JP01ClassObjDemo {

	public static void main(String[] args) {
		int sum1 = 0;
		
		sum1 = addNumbers(10, 20);
		System.out.println(sum1);
	}
	
	static int addNumbers(int n1, int n2) {
		
		return n1 + n2;
	}
}
