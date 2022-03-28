package pkg10thiskeyword;

public class JPThisKeywordDemo {
	int length;
	int breadth;
	
	JPThisKeywordDemo() {
		
		this(10, 8);
		System.out.println("After this call.");
	}
	
	JPThisKeywordDemo(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
		System.out.println("two arg constrcutor");
	}

	public static void main(String[] args) {
		
		JPThisKeywordDemo obj = new JPThisKeywordDemo();
		
		System.out.println("Length: " + obj.length);
		System.out.println("Length: " + obj.breadth);
	}
}
