/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

// Assignment: 08
// Define a variable “a = 187”. Use a bitmask so that the output will be number 9.
// Use any bitwise operator. Print the output.

public class Assign08BitwiseOp {

	public static void main(String[] args) {
		
		int a = 187;    // 10111011
		int bm = 9;     // 00001101
		int res = 0;    // 00001001
		
		res = a & bm;
		System.out.println("Res: " + res);
	}
}
