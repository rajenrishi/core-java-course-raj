package pkg02operators;

public class BitwiseOperatorsDemo {

	public static void main(String[] args) {
        int x = 9, y = 8;
        // bitwise and
        // 1001
        // 1000
        // 1000   =====> 8
//        System.out.println("x & y = " + (x & y));
        // 1001
        // 1000
        // 1001   =====> 9
//        System.out.println("x | y = " + (x | y));
        

        // 1000 ==> 8
        // 0100 ==> 4
//        System.out.println("x >> 1 = " + (x >> 1));

        // 00000000 0000000 0000000 00001000 ==> 8
        // 00000000 0000000 0000000 00010000 ==> 16
        System.out.println("y << 1 = " + (y << 1));

        // 10000000 0000000 0000000 00000100 ==> -4
        int z = -4;
        System.out.println("z >> 1 = " + (z >> 1));
        
        // 11110000 0000000 0000000 00000100 ==> -4
        // 01111111 1111111 1111111 11111100 ==> -4
        z = -4;
        System.out.println("z >> 1 = " + (z >>> 1));  // unsigned 
        
        
	}
}
