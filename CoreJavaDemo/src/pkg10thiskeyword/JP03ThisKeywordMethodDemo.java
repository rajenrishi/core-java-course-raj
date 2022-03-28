package pkg10thiskeyword;

public class JP03ThisKeywordMethodDemo {
	int length;
	int breadth;
		
	JP03ThisKeywordMethodDemo(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public void display() {

		System.out.println("Length: " + this.length);
		System.out.println("Breadth: " + this.breadth);
	}
	
	public void getMeasurements() {
		
		this.display();
	}

	public static void main(String[] args) {
		
		JP03ThisKeywordMethodDemo obj = new JP03ThisKeywordMethodDemo(10, 9);
		obj.getMeasurements();
	}
}
