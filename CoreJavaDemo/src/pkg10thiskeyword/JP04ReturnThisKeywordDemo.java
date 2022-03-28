package pkg10thiskeyword;

public class JP04ReturnThisKeywordDemo {
	int length;
	int breadth;
		
	JP04ReturnThisKeywordDemo(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getM() {

		System.out.println("Length: " + this.length);
		System.out.println("Breadth: " + this.breadth);
	}
	
	public JP04ReturnThisKeywordDemo display() {
		
		return this;
	}

	public static void main(String[] args) {
		
		JP04ReturnThisKeywordDemo obj = new JP04ReturnThisKeywordDemo(10, 9);
		
		JP04ReturnThisKeywordDemo obj1 = obj.display();
		obj1.getM();
	}
}
