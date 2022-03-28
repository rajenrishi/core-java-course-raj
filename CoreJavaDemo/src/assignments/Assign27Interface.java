package assignments;

//Assignment: 27
//Write an Interface with name SubmitButton. In the interface define clickButton() method.
//Write class to implement the SubmitButton interface and add implementation for 
//clickButton() method. You can add some print statements in the method.
//Call the clickButton() method, which should print as per the print statements in that method.

interface SubmitButton {
	
	void clickButton();
}

class PerformClick implements SubmitButton {

	@Override
	public void clickButton() {
		
		System.out.println("Control is in clickButton method, Perform Click class.");
	}
}
/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */


public class Assign27Interface {

	public static void main(String[] args) {

		PerformClick pc = new PerformClick();
		pc.clickButton();
	}
}
