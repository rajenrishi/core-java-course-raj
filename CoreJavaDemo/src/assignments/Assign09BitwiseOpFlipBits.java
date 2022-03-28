/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 09
//Define a variable “a = 187”. Use a bitmask so that all the bits are flipped. 
//Use any bitwise operator. Print the output.

public class Assign09BitwiseOpFlipBits {

	public static void main(String[] args) {
		
		int a = 187;    // 10111011
		int bm = 254;     // 11111110
		int res = 0;    // 00001001
		
		res = a | bm;
		System.out.println("Res: " + res);
	}
}
