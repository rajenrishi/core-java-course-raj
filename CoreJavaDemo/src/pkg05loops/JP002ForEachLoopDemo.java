package pkg05loops;

public class JP002ForEachLoopDemo {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 2};
		
		for(int n : nums) {
			System.out.println(n*n);
		}
	}
}
